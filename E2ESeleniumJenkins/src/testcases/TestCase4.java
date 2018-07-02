package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4 {
	//Adding branch deveoper comment here	
	@Test
	/**
	* @wi.implements elibrary/EL-343 A Comment on Master
	*/
	public void testcase4()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("hello");
		driver.quit();
	}
// Adding comment on developer branch
	// Adding another developer comment
}
