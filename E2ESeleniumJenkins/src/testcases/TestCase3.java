package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test
	/**
	* @wi.implements elibrary/EL-343 A Comment on Master
	*/
	public void testcase3()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("hello");
		driver.quit();
	}
<<<<<<< HEAD

	// Comment here (developer), merge to master
	// Newline on hotfix branch


// New comment on master
	// Comment here (developer)


=======
// DPD-39
>>>>>>> branch 'feature-branch' of https://github.com/peterazp/E2EDemo.git
}
