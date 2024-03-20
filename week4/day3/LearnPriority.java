package week4.day3;

import org.testng.annotations.Test;

public class LearnPriority {

	@Test
	public void leads() {
		System.out.println("Leads");
	}
	
	@Test(priority = 3)
	public void opportunity() {
		System.out.println("opportunity");
	}
	
	@Test(priority = -1,enabled = false)
	public void accounts() {
		System.out.println("accounts");
	}
	
	@Test
	public void contacts() {
		System.out.println("Contacts");
	}
	
	
	
	
	
	
	
}
