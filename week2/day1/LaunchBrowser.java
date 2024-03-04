package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// Create a object for BrowserDriver
			// Pre-requirement --> add selenium java dependency into the pom.xml
			// In my system i have to install the Browser for the BrowserDriver
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//To load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		// Locate the Username field
		//Datatype variable = value
		WebElement username = driver.findElement(By.id("username"));// ctrl+2, l --> shortcut to assign into a variable
		
		//Enter the username as Demosalesmanager
		username.sendKeys("Demosalesmanager");
		
		//Locate the password field and enter the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//locate the login button and click
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Locate the CRM/SFA link and click
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//To stop our execution for 2second which is 2000milliSeconds
		Thread.sleep(2000);
		
		//To close the window
		driver.close();
		
	}

}
