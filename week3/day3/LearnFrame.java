package week3.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);// switching the frame by using index.
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		
		driver.switchTo().defaultContent();// it will back to WebPage.
		
		boolean displayed = driver.findElement(By.xpath("//h5[text()=' How many frames in this page?']")).isDisplayed();
		System.out.println(displayed);
		
		WebElement secondFrame = driver.findElement(By.xpath("//h5[text()=' How many frames in this page?']/following-sibling::iframe"));
		driver.switchTo().frame(secondFrame); // switching the frame by using WebElement
		
		String textFromSecondFrame = driver.findElement(By.id("Click")).getText();
		System.out.println("textFromSecondFrame : "+textFromSecondFrame);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> frameCounts = driver.findElements(By.tagName("iframe"));
		System.out.println(frameCounts.size());
		
		
		driver.switchTo().frame(2);// outer frame 
		driver.switchTo().frame("frame2");// inner frame //Switching the franme by id or name attribute value 
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		driver.switchTo().parentFrame();// 1step come out from the frame 
		frameCounts = driver.findElements(By.tagName("iframe"));
		System.out.println(frameCounts.size());
	}

}
