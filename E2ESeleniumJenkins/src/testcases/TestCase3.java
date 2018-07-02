package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test
	public void testcase3()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("hello");
		driver.quit();
	}
	// Comment here (developer)
}
