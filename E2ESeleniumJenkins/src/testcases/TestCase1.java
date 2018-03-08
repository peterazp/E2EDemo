package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	/**
	 * @wi.implements elibrary/EL-254 describing method
	 */
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("helllo");
		driver.quit();
		
	}
// Passing TC 1
}
