package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{

	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage enterCompanyName() {
		
		return this;
	}
	
	public CreateLeadPage enterFirstName() {
		
		return this;
	}
	
	public CreateLeadPage enterLastname() {
		
		return this;
	}
	
	public ViewLeadPage clickCreateLeadBtn() {
		
		return new ViewLeadPage(driver);
	}
	
}
