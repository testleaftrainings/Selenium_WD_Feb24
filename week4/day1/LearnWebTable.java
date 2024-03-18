package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/table.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String row4Col5 = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[4]/td[5]")).getText();
		
		System.out.println("row4Col5 : " +row4Col5);
		
		String row10Col4 = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[10]/td[4]")).getText();
		
		System.out.println("row10Col4 : " +row10Col4);
		
		int rowCount = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr")).size();
		
		int colCount = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr[1]/td")).size();
		
		for (int i = 1; i <= rowCount ; i++) {
			String name = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println("name"+i+" is " + name);
		}
		
		for (int i = 1; i <= colCount; i++) {
			String text = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr[1]/td["+i+"]")).getText();
			System.out.println("Row 1 column"+i+" is "+ text);
		}
		
		
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 1; j <= colCount; j++) {
				String text = driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println("Row "+i+" Column "+j+" is "+ text);
			}
		}
		
		
	}

}
