package week4.day3;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

	//access modifier  returntype methood name inputArguments{}
	
	@Test
	public void runCreateLead() throws IOException {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		
		//To
		
		//To take a screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		//Which location i want to store the screenShot
		File des = new File("C:/Users/DELL/OneDrive - TestLeaf Software Solutions Private Limited/WeekDay_Feb24_Notes/ViewLead.jpg");//png. jpg, jpge
		// Copy the screenshot into the file location
		FileUtils.copyFile(src, des);
		
		WebElement viewLeadWE = driver.findElement(By.xpath("//div[@id='center-content-column']"));
		
		File src1 = viewLeadWE.getScreenshotAs(OutputType.FILE);
		File des1 = new File("./snaps/ViewLeadWE.png");
		FileUtils.copyFile(src1, des1);
		
}
}






