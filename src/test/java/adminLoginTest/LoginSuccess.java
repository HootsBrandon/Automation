package adminLoginTest;

import java.io.IOException;

import org.testng.annotations.Test;

import baseObjects.SetupAndClose;
import pageObjects.LoginPage;

//import pageObjects.LoginPage;

public class LoginSuccess extends SetupAndClose {

	@Test(groups= {"Regression"})
	public void Success() throws IOException {
		
		Setup();
		LoginPage lp = new LoginPage(driver);
		lp.setUserId("bhoots@scoir.com");
		lp.setPassword("Test1234");
		lp.clickSignIn();
		ClosePage();
		
	}

}
