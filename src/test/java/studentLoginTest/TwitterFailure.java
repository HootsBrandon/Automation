package studentLoginTest;

import java.io.IOException;

import org.testng.annotations.Test;

import baseObjects.SetupAndClose;
import pageObjects.LoginFacebookPage;
import pageObjects.LoginPage;

public class TwitterFailure extends SetupAndClose {
	
	@Test(groups= {"Failure"})
	public void LoginTwitterFailure() throws IOException {
	
		Setup();
		LoginPage lp = new LoginPage(driver);
		LoginFacebookPage ltp = new LoginFacebookPage(driver);
		
		lp.clickTwitterSignIn();
		ltp.setUserId("Bhoots+WrongTwitter@scoir.com");
		ltp.setPassword("1234");
		ClosePage();
		
	}

}
