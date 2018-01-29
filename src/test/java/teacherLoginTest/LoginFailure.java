package teacherLoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginFailure {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/brandonhoots/Webdrivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://sif.scoir.com/signin");
		
	}

	@Test
	public void Failure() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserId("WrongTeacher@scoir.com");
		lp.setPassword("1234");
		lp.clickSignIn();
		
	}
	
	@AfterTest
	public void end() {
		
	driver.quit();
	
	}

}
