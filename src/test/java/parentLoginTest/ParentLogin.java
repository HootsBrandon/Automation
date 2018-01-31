package parentLoginTest;

import java.io.IOException;

import org.testng.annotations.Test;

import baseObjects.SetupAndClose;
import pageObjects.LoginPage;

public class ParentLogin extends SetupAndClose {

	@Test
	public void Success() throws IOException {
		
		Setup();
		LoginPage lp = new LoginPage(driver);
		lp.setUserId("bhoots+Greceiver1P1@scoir.com");
		lp.setPassword("Test1234");
		lp.clickSignIn();
		ClosePage();
		
		
	}

}
