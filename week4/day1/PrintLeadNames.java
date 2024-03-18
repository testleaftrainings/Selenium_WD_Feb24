package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class PrintLeadNames {

	public static void main(String[] args) throws InterruptedException {
ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Default implicitlyWait is zero
		
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
		
		WebElement leadsTab = driver.findElement(By.xpath("//a[@title='Leads']"));
		
		driver.executeScript("arguments[0].click();", leadsTab);
		
		Actions action = new Actions(driver);
		WebElement row14 = driver.findElement(By.xpath("//table/tbody/tr[14]"));
		WebElement row1 = driver.findElement(By.xpath("//table/tbody/tr[1]"));
		action.dragAndDrop(row14, row1).perform();
		
		Thread.sleep(5000);
		int rowCount = driver.findElements(By.xpath("//table/tbody/tr")).size();
		
		for (int i =1; i <=rowCount; i++) {
			
			String name = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/th[1]")).getText();
			System.out.println("Name "+i+" is "+name);
			
		}
	}

}
