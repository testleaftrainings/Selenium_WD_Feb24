package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateOpportunity {

	@Test(dataProvider = "sendData")
	public void runCreateOpportunity(String opportunityName) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
		WebElement opportunityTab = driver.findElement(By.xpath("//span[text()='Opportunities']/parent::a"));
		driver.executeScript("arguments[0].click();", opportunityTab);
		
		driver.findElement(By.xpath("//div[text()='New']/parent::a")).click();
		
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys(opportunityName);
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		
		driver.findElement(By.xpath("//td[@class='slds-is-today']/following-sibling::td")).click();
		
		driver.findElement(By.xpath("//button[contains(@aria-label,'Stage - Current Selection')]")).click();
		
		driver.findElement(By.xpath("//*[@data-value='Needs Analysis']")).click();
		
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		
		
	}
	
	
	@DataProvider(indices = {1,0}, name= "sendData")
	public String[][] fetchData() {
		String[][] data = new String[3][1];
		data[0][0] = "Gokul";
		data[1][0] ="Babu";
		data[2][0] ="Hari";
		return data;
	}
	
	
	
}
