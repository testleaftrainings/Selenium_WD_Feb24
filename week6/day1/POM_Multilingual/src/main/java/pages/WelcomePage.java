package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{

	public WelcomePage(ChromeDriver driver) {
		this.driver =driver;
	}

	public HomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return  new HomePage(driver);
	}
	
	public LoginPage clickLogoutBtn() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
	
	
	
	
	
}
