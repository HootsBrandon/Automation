package studentLoginTest;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.BaseSetupOject;
import pageObjects.LoginFacebookPage;
import pageObjects.LoginPage;

public class FacebookFailure extends BaseSetupOject {

	@Test
	public void LoginFacebookFailure() throws IOException {
		
		Setup();
		LoginPage lp = new LoginPage(driver);
		LoginFacebookPage lfp = new LoginFacebookPage(driver);
		
		lp.clickFacebookSignIn();
		lfp.setUserId("Bhoots+WrongFacebook@scoir.com");
		lfp.setPassword("1234");
		ClosePage();
		
	}

}
