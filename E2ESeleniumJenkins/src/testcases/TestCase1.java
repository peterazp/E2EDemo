package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
// hey
	@Test
	// Another new comment here
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.��p�����.com");
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("helllo");
		driver.quit();
		
	}

}
