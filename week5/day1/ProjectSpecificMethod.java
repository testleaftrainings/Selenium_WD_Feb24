package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	
	public RemoteWebDriver driver;
	
	//From xml to parameters naming convention should be same but order can either same or different
	@Parameters({"url","un","pass","browser"})// from xml file to @parameters we can use any order
	@BeforeMethod
	
	//From parameter to input args order should br same, we can use any naming 
	public void preCondition(String url, String uname, String pwd,String browser) {// in input argus we need to follow the same order written in the @Parameters
//		driver = new ChromeDriver();
		
		switch(browser) {
		
		case "Chrome" :
			
			driver = new ChromeDriver();
			break;
			
		case "Edge" :
			driver = new EdgeDriver();
			break;
		
		case "Firefox" :
			driver = new FirefoxDriver();
			break;
			
		case "IE" :
			driver = new InternetExplorerDriver();
			break;
			
		default:
			driver = new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		System.out.println("url : " + url);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("username : " + uname);
		driver.findElement(By.id("username")).sendKeys(uname);
		System.out.println("Password : "+ pwd);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	

}
