package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFBAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//Click on the Create new account hyper link
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		//Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Gokul");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Sekar");
		
		//Enter the email id
		driver.findElement(By.name("reg_email__")).sendKeys("jeyagokul.sekar@testleaf.com");
		
		//Re-enter the email id 
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jeyagokul.sekar@testleaf.com");

	}

}
