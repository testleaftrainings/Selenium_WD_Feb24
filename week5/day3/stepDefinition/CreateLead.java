package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod {
	
	
	
	
	@When("Click on the crmsfa")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@When("Click on the Leads tab")
	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
		
	}
	
	@When("Click on the Create Lead link")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
//	 (.*)$   ---> Any object
	@Given("Enter the company name as (.*)$")
	public void enterCname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	
	@Given("Enter the first name as (.*)$")
	public void enterFname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	
	@Given("Enter the last name as (.*)$")
	public void enterLname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	
	@Given("Enter the phno (.*)$")
	public void enterPhno(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
	}
	
	@When("Click on the submit button")
	public void clickSubmitBtn() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	
}
