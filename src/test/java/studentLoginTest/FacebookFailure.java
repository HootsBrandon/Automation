package studentLoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginFacebookPage;
import pageObjects.LoginPage;

public class FacebookFailure {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/brandonhoots/Webdrivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://sif.scoir.com/signin");
	
	}
	
	@Test
	public void LoginFacebookFailure() {
		
		LoginPage lp = new LoginPage(driver);
		LoginFacebookPage lfp = new LoginFacebookPage(driver);
		
		lp.clickFacebookSignIn();
		lfp.setUserId("Bhoots+WrongFacebook@scoir.com");
		lfp.setPassword("1234");
		
	}
	
	@AfterTest
	public void end() {
		
	driver.quit();
	
	}

}
