package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_LoginTC  extends ProjectSpecificMethod{

	@Test
	public void runLogin() {
		System.out.println("This is from Test method "+driver);
		LoginPage lp = new LoginPage(driver); // Through the constructor  pass the driver instance
		/*lp.enterUsername();  // Not Recommanded
		lp.enterPassword();*/
		
		lp.enterUsername()
		.enterPassword()
		.clickLoginBtn()
		.clickCrmsfa();
		
		
	/*	lp.enterPassword()
		.enterUsername()
		.clickLoginBtn(); */
		
		
	}
	
}
