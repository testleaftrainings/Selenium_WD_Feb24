package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundCheckbox {

	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://leafground.com/checkbox.xhtml");
			
			driver.manage().window().maximize();
			WebElement basicCheckbox = driver.findElement(By.xpath("//input[@aria-label='Basic']"));
			boolean beforeClick = basicCheckbox.isSelected();
			System.out.println("Before click :" + beforeClick );
//			basicCheckbox.click();
			driver.executeScript("arguments[0].click();", basicCheckbox);
			boolean afterClick = driver.findElement(By.xpath("//input[@aria-label='Basic']")).isSelected();
			System.out.println("After click : " + afterClick);
			
		/*	boolean beforeClick = driver.findElement(By.xpath("//input[@value='Tshirts']")).isEnabled();
			System.out.println("Before click : " +beforeClick);
			//Steps to click using javaScript
			// step 1  store as a WebElement
			WebElement tshirtCB = driver.findElement(By.xpath("//input[@value='Tshirts']"));
			//Steps 2 click using JS
			driver.executeScript("arguments[0].click();",tshirtCB );
			
			boolean afterClick = driver.findElement(By.xpath("//input[@value='Tshirts']")).isEnabled();
			System.out.println("After click : " +afterClick);
			
			*/
			driver.get("https://leafground.com/button.xhtml;");
			boolean clickWE = driver.findElement(By.name("j_idt88:j_idt90")).isEnabled();
			System.out.println("click WebElement is enabled : " +clickWE);
			
			
			boolean disabledBtn = driver.findElement(By.name("j_idt88:j_idt92")).isEnabled();
			System.out.println("Disabled button is enabled : " +disabledBtn);
			
			
			Point submitBtnLocation = driver.findElement(By.name("j_idt88:j_idt94")).getLocation();
			System.out.println("Submit button location : " + submitBtnLocation);
			
			boolean displayed = driver.findElement(By.name("j_idt88:j_idt94")).isDisplayed();
			System.out.println("Submit is visible : " +displayed);
			
			Dimension size = driver.findElement(By.name("j_idt88:j_idt94")).getSize();
			System.out.println("Size of the submit in dimension is "+ size);
			
			String cssValue = driver.findElement(By.name("j_idt88:j_idt94")).getCssValue("background-color");
			System.out.println("colour of the submit button in rgb --> " + cssValue);
			
			
			System.out.println("My current url is " + driver.getCurrentUrl());
			
			
	}

}
