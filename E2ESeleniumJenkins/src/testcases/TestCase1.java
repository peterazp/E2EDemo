package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	/**
	 * @wi.implements elibrary/EL-220 chromedriver
	 */
	public void testcase1()
	{
		System.setProperty("ebdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.a����.com");
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("hello");
		driver.quit();
	}

}
