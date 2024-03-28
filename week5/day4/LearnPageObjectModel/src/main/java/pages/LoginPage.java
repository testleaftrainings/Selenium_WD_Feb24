package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{

	public LoginPage(ChromeDriver driver) {
		this.driver = driver;  // gobal driver = local driver, Assigning local driver value into the global driver varibale
	}

	public LoginPage enterUsername() {
		System.out.println("This is from enter user name method "+driver);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Option 1
//		LoginPage lp = new LoginPage(); // dataType varibale = value;
//		return lp;
		//Option 2 
//		return new LoginPage();
		//option 3
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public WelcomePage clickLoginBtn() {
		driver.findElement(By.className("decorativeSubmit")).click();
//		WelcomePage wp = new WelcomePage();
//		return wp;
		
		return new WelcomePage(driver);
	}
	
}
