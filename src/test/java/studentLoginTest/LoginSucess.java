package studentLoginTest;

import java.io.IOException;

import org.testng.annotations.Test;

import baseObjects.SetupAndClose;
import pageObjects.LoginPage;

public class LoginSucess extends SetupAndClose {
	
	@Test(groups= {"Regression"}) // Each @Test is treated as a new test
	public void LoginSuccess() throws IOException {
		
		Setup();
		LoginPage lp = new LoginPage(driver);
		lp.setUserId("bhoots+Greceiver1S26@scoir.com");
		lp.setPassword("Test1234");
		lp.clickSignIn();
		ClosePage();
		
	}
		
}
