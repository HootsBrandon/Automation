package webLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

//import pageObjects.LoginPage;

public class AdminLogin {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/brandonhoots/Webdrivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://sif.scoir.com/signin");
		
	}
	
	@Test
	public void LoginSuccess() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserId("bhoots@scoir.com");
		lp.setPassword("Test1234");
		lp.clickSignIn();
		
		
	}
	
	@Test
	public void LoginFailure() {
		
	}

}
