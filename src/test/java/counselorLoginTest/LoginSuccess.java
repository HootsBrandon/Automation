package counselorLoginTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.BaseOjects;
import pageObjects.LoginPage;

public class LoginSuccess extends BaseOjects {

	@Test
	public void Success() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserId("bhoots+Greceiver1C1@scoir.com");
		lp.setPassword("Test1234");
		lp.clickSignIn();
		
	}
	
	@AfterTest
	public void end() {
		
	driver.quit();
	
	}

}
