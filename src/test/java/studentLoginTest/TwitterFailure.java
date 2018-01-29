package studentLoginTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.BaseOjects;
import pageObjects.LoginFacebookPage;
import pageObjects.LoginPage;

public class TwitterFailure extends BaseOjects {
	
	@Test
	public void LoginTwitterFailure() {
	
		LoginPage lp = new LoginPage(driver);
		LoginFacebookPage ltp = new LoginFacebookPage(driver);
		
		lp.clickTwitterSignIn();
		ltp.setUserId("Bhoots+WrongTwitter@scoir.com");
		ltp.setPassword("1234");
		
	}
	
	@AfterTest
	public void end() {
		
	driver.quit();
	
	}

}
