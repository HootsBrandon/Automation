package studentLoginTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.BaseOjects;
import pageObjects.LoginFacebookPage;
import pageObjects.LoginPage;

public class FacebookFailure extends BaseOjects {

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
