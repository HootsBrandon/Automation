package studentLoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginFacebookPage;
import pageObjects.LoginPage;

public class FacebookSuccess {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/brandonhoots/Webdrivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://sif.scoir.com/signin");
	
	}
	
	@Test
	public void LoginFacebookSuccess() {
		
		LoginPage lp = new LoginPage(driver);
		LoginFacebookPage lfp = new LoginFacebookPage(driver);
		
		lp.clickFacebookSignIn();
		driver.switchTo().window("https://api.twitter.com/oauth/authenticate?oauth_token=gAhKQwAAAAAAZQalAAABYUKN_FI");
		lfp.setUserId("Bhoots+Facebook2@scoir.com");
		lfp.setPassword("Test1234");
		
	}
	
	@AfterTest
	public void end() {
		
	driver.quit();
	
	}

}
