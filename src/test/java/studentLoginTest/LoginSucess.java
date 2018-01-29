package studentLoginTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.BaseOjects;
import pageObjects.LoginPage;

public class LoginSucess extends BaseOjects {
	
	@Test // Each @Test is treated as a new test
	public void LoginSuccess() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserId("bhoots+Greceiver1S26@scoir.com");
		lp.setPassword("Test1234");
		lp.clickSignIn();
		
	}
	
	@AfterTest
	public void end() {
		
	driver.quit();
	
	}
	
	
}
