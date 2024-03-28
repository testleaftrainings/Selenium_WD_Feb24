package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LeadsPage clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);
	}
	
}
