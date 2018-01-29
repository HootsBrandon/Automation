package adminLoginTest;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.BaseSetupOject;
import pageObjects.LoginPage;

public class LoginFailure extends BaseSetupOject {
	
	@Test
	public void Failure() throws IOException {
		
		Setup();
		LoginPage lp = new LoginPage(driver);
		lp.setUserId("WrongAdmin@scoir.com");
		lp.setPassword("1234");
		lp.clickSignIn();
		ClosePage();
		
	}

}
