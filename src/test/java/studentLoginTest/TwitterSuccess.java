package studentLoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.LoginTwitterPage;

public class TwitterSuccess {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/brandonhoots/Webdrivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://sif.scoir.com/signin");
	
	}
	
	@Test
	public void LoginTwitterSuccess() {
		
		LoginPage lp = new LoginPage(driver);
		LoginTwitterPage ltp = new LoginTwitterPage(driver);
		
		lp.clickTwitterSignIn();
		ltp.setUserId("Bhoots+Twitter@scoir.com");
		ltp.setPassword("Test1234");
		
	}
	
	@AfterTest
	public void end() {
		
	driver.quit();
	
	}

}
