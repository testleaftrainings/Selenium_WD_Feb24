package week6.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnThreadLocal {

	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	
	
	public void setDriver() {
		rd.set(new ChromeDriver());
	}
	
	
	public RemoteWebDriver getDriver() {
		return rd.get();
	}
	
	
	
	
	@Test
	public void run() {
		setDriver();
		getDriver().get("http://leaftaps.com/opentaps/");
	}
	
	
	
}
