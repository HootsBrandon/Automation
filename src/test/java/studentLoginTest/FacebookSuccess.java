package studentLoginTest;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.BaseSetupOject;
import pageObjects.LoginFacebookPage;
import pageObjects.LoginPage;

public class FacebookSuccess extends BaseSetupOject{
	
	@Test
	public void LoginFacebookSuccess() throws IOException {
		
		Setup();
		LoginPage lp = new LoginPage(driver);
		LoginFacebookPage lfp = new LoginFacebookPage(driver);
		lp.clickFacebookSignIn();
		
		//driver.switchTo().window("https://api.twitter.com/oauth/authenticate?oauth_token=gAhKQwAAAAAAZQalAAABYUKN_FI");
		lfp.setUserId("Bhoots+Facebook2@scoir.com");
		lfp.setPassword("Test1234");
		ClosePage();
		
	}

}
