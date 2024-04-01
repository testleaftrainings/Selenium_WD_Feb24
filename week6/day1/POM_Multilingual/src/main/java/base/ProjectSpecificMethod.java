package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {

	public  ChromeDriver driver;
	public static Properties prop;
	
	@Parameters({"propName"})
	@BeforeMethod
	public void preCondition(String propName) throws IOException {
		
		FileInputStream fis = new FileInputStream("src/main/resources/"+propName+".properties");
		
		//Create object for Properties class
		prop = new Properties();
		
		//Load the properties file into the properties class
		prop.load(fis);
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps");
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	
}
