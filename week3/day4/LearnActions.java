package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
//		driver.get("https://myntra.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action = new Actions(driver);
/*		
		WebElement menWE = driver.findElement(By.xpath("//a[text()='Men']"));
		
		action.moveToElement(menWE).perform();
		WebElement jacketsWE = driver.findElement(By.xpath("//a[text()='Jackets']"));
		
		action.click(jacketsWE).perform();
		
		
		WebElement pageBtm = driver.findElement(By.xpath("//div[@class='desktop-copywrite']"));
		action.scrollToElement(pageBtm).perform();
		
		driver.get("https://leafground.com/drag.xhtml");
		
		WebElement draggableWE = driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		
		action.dragAndDropBy(draggableWE, 150, 0).pause(5000).dragAndDropBy(draggableWE, 150, 0)
				.pause(5000).dragAndDropBy(draggableWE, -200, 0).perform();
		
		WebElement srcWE = driver.findElement(By.id("form:drag_content"));
		WebElement targetWE = driver.findElement(By.id("form:drop"));
		
		action.dragAndDrop(srcWE, targetWE).perform();
		
		WebElement draggableColumnWE = driver.findElement(By.xpath("//h5[text()='Draggable Columns']"));
		action.doubleClick(draggableColumnWE).perform();
		action.doubleClick(draggableWE).perform();
		
		driver.get("https://leafground.com/menu.xhtml");
		
		action.contextClick().perform();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Testleaf", Keys.ENTER);
		
		WebElement testleafLink = driver.findElement(By.xpath("//h3[text()='Testleaf: Selenium Training | Software Testing Course']"));
		
		action.contextClick(testleafLink).keyDown(Keys.DOWN).keyUp(Keys.DOWN)
		.keyDown(Keys.DOWN).keyUp(Keys.DOWN)
			.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		*/
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		
		action.clickAndHold(item1).pause(2000)
			.clickAndHold(item3).pause(2000)
				.clickAndHold(item5).release().perform(); // selected from item1 to item5
		
		action.keyDown(Keys.CONTROL).click(item1).pause(1000)
			.click(item3).pause(1000)
			.click(item5).pause(1000).keyUp(Keys.CONTROL).perform();

		
	}

}
