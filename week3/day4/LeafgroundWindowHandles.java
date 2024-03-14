package week3.day4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundWindowHandles {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
				
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowAddress : windowHandles) {
			System.out.println(windowAddress);
			driver.switchTo().window(windowAddress);
			System.out.println(driver.getTitle());
		}
		
		driver.close();// close the current window
		
		//To open a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		//To open a new tab
				driver.switchTo().newWindow(WindowType.TAB);
				
				

		
		
//		driver.quit();// It will close all the opened windows and kill the driver instance.
		
		
	}

}
