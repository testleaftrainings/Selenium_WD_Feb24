package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends ProjectSpecificMethod {

	
	
	@When ("Click on the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	
	@Given("Load the url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps");
		
	}
	
	

	@Given("Enter the password")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	
	
	@Then ("Verify login is successful")
	public void verifyLogin() {
		System.out.println(driver.getTitle());
	}
	
	@Given ("Launch the browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Given ("Enter the username")
	public void enterUserName() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}
	
	
}
