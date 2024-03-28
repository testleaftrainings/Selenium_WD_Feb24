package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LeadsPage;
import pages.LoginPage;

public class TC_002_CreateLeadTC extends ProjectSpecificMethod {

	@Test
	public void runCreateLead() {
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginBtn()
		.clickCrmsfa()
		.clickLeadsTab()
		.clickCreateLeadLink();
		
		new LeadsPage(driver)
		.clickFindLeadLink();
		
	}
}
