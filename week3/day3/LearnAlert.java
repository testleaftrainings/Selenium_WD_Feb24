package week3.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		//Locate and click on the simple alert button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//To handle modal alert -> transfer the driver control into the alert box
		Alert alert = driver.switchTo().alert();
		
		//simple Alert
		
		String simpleAlertTxt = alert.getText();
		System.out.println("simpleAlertTxt : "+simpleAlertTxt);
		alert.accept();// 
		
		
		//Confirmation Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		String confirmationAlertTxt = alert.getText();
		System.out.println("confirmationAlertTxt : "+confirmationAlertTxt);
		
//		alert.accept();
		alert.dismiss();
		
		
		//Prompt Alert
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span[text()='Show']")).click();
		
		String promptAlertTxt = alert.getText();
		System.out.println("promptAlertTxt : "+promptAlertTxt);
		
		alert.sendKeys("Gokul");
		alert.accept();
		
		
		
		//Non modal alert - sweet alert
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']/following-sibling::button/span[text()='Show']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		

		
	}

}
