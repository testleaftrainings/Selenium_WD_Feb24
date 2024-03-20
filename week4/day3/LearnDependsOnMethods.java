package week4.day3;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {

	@Test(timeOut = 500)// packageName.className.methodName
	public void create() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("Create");
	}
	
	@Test(dependsOnMethods = "create")
	public void Edit() {
		System.out.println("Edit");
	}
	
	@Test(dependsOnMethods = {"Edit","create"}, alwaysRun = true)
	public void delete() {
		System.out.println("Delete");
	}
}
