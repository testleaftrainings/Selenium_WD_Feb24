package week3.day2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllPrices {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-tshirts");
		
		driver.manage().window().maximize();
		
		List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='product-price']"));
		
		List<Integer> prices= new LinkedList<Integer>();
		int size = allPrices.size();
		
		for (int i = 0; i <size; i++) {
			WebElement priceWE = allPrices.get(i);
			String price = priceWE.getText();
//			System.out.println(price);
			String[] split = price.split(" ");
//			System.out.println((i+1)+" ");
			String priceStr = split[1].replaceAll("[^0-9]", "");
			int parseInt = Integer.parseInt(priceStr);
			prices.add(parseInt);
		}
		prices.add(1000);
		System.out.println("Before sorting " + prices );
		Collections.sort(prices);
		System.out.println("After sorting " + prices);
		
	}

}
