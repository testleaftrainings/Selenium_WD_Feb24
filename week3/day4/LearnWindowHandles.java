package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandles {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Default implicitlyWait is zero
		String currentWindow = driver.getWindowHandle();
		System.out.println("currentWindow before entering username : "+currentWindow);
		
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		//TO get current window address
		currentWindow = driver.getWindowHandle();
		System.out.println("currentWindow after login : "+currentWindow);

		//To get multi/all window address 
		Set<String> windowHandles = driver.getWindowHandles();//LinkedHashSet
		for (String windowAddress : windowHandles) {
			System.out.println(windowAddress);
		}
		
		List<String> window = new ArrayList<String>(windowHandles);
		
		System.out.println("Child window address is :" + window.get(1));
		
		System.out.println(driver.getTitle());
		
		//Transfer the driver control into the child window
		driver.switchTo().window(window.get(1));
		System.out.println("Child window title "+driver.getTitle());
		
	}

}
