package studentLoginTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.BaseOjects;
import pageObjects.LoginFacebookPage;
import pageObjects.LoginPage;

public class FacebookSuccess extends BaseOjects{
	
	@Test
	public void LoginFacebookSuccess() {
		
		LoginPage lp = new LoginPage(driver);
		LoginFacebookPage lfp = new LoginFacebookPage(driver);
		lp.clickFacebookSignIn();
		
		//driver.switchTo().window("https://api.twitter.com/oauth/authenticate?oauth_token=gAhKQwAAAAAAZQalAAABYUKN_FI");
		lfp.setUserId("Bhoots+Facebook2@scoir.com");
		lfp.setPassword("Test1234");
		
	}
	
	@AfterTest
	public void end() {
		
	driver.quit();
	
	}

}
