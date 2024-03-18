package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/waits.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		
		WebElement elementToHide = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		
		Boolean hide = wait.until(ExpectedConditions.invisibilityOf(elementToHide));
		
		hide = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		
		hide = wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//span[text()='I am about to hide']"), "I am about to hide"));
		
		System.out.println("Element is hidden : " +hide );
		
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='ui-growl ui-widget']")));
		
		driver.findElement(By.xpath("//span[text()='Click Second']")).click();
		
		
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		
		//span[text()='I am going to change!']
		Boolean textToChange = wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//span[text()='I am going to change!']"), "Did you notice?"));
		
		textToChange = wait.until(ExpectedConditions.textToBe(By.xpath("//button[@name='j_idt87:j_idt99']/span"), "Did you notice?"));
		
		System.out.println(textToChange);
		
		
		
		driver.get("https://leafground.com/frame.xhtml");
		WebDriver frame1 = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
		System.out.println("frame1 : "+frame1);
		WebDriver frame2 = wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame2"));
		System.out.println("frame2 : "+frame2);
		
		driver.findElement(By.xpath("//*[text()='Click Me']")).click();
		
		
		driver.get("https://leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Boolean windows = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println(windows);
		
		
	}

}
