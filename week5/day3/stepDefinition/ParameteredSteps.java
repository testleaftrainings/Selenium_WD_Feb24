package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class ParameteredSteps extends ProjectSpecificMethod{

	@Given ("Enter the username as {string}")
	public void enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	
	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
}


