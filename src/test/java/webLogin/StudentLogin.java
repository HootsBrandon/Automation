package webLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class StudentLogin {
		WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/brandonhoots/Webdrivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://sif.scoir.com/signin");
		
	}
	
	@Test // Each @Test is treated as a new test
	public void LoginSuccess() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserId("bhoots+Greceiver1S26@scoir.com");
		lp.setPassword("Test1234");
		lp.clickSignIn();
		
		
		
	}
	
	@Test
	public void LoginFailure() {
		
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void LoginFacebookSuccess() {
		
	}
	
	@Test
	public void LoginFacebookFailure() {
		
	}
	
	@Test
	public void LoginTwitterSuccess() {
		
	}
	
	@Test
	public void LoginTwitterFailure() {
		
	}
	
}
