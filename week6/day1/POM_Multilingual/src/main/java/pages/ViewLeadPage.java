package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {

	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public void retriveLeadID() {
		String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(leadId);
	}
	
	public void clickDuplicateLeadBtn() {
		
	}
	
	public void clickEditLeadBtn() {
		
	}
	
	public void clickDeleteLeadBtn() {
		
	}
	
}
