package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods {

	public static void main(String[] args) {

		//Launch the browser
		ChromeDriver driver = new ChromeDriver();// ctrl+shift+o --> import organize
		
		//Load the url
		driver.get("https://leafground.com/input.xhtml");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Locate the input field type your name
		WebElement typeYourName = driver.findElement(By.name("j_idt88:name"));// to assign into local variable ctrl+2, l
		
		String placeholderValue = typeYourName.getAttribute("placeholder");// inside method argument enter the attribute name
		System.out.println("Placeholder value is : " + placeholderValue);
 		
		typeYourName.sendKeys("Gokul");
		String value = driver.findElement(By.name("j_idt88:name")).getAttribute("value");
		System.out.println("value : " +value);

	}

}
