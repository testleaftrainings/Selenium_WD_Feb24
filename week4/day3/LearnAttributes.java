package week4.day3;

import org.testng.annotations.Test; //ctrl +shift+o --> import organize

public class LearnAttributes {

	@Test(invocationCount = 10, invocationTimeOut = 6000, threadPoolSize = 3)
	public void create() throws InterruptedException {
		System.out.println("Create from Learn Attribute");
		Thread.sleep(2000);
	}
	
	@Test
	public void edit() {
	System.out.println("Edit from Learn Attribute");	
	}
	
	@Test(invocationCount = 3 ,invocationTimeOut = 500)
	public void duplicate() {
		System.out.println("Duplicate from Learn Attribute");
	}
	
	
	
}
