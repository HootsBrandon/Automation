package studentLoginTest;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.BaseSetupOject;
import pageObjects.LoginPage;
import pageObjects.LoginTwitterPage;

public class TwitterSuccess extends BaseSetupOject {

	@Test
	public void LoginTwitterSuccess() throws InterruptedException, IOException {
		
		Setup();
		LoginPage lp = new LoginPage(driver);
		LoginTwitterPage ltp = new LoginTwitterPage(driver);
		
		lp.clickTwitterSignIn();
		driver.wait(3000);
		ltp.setUserId("Bhoots+Twitter@scoir.com");
		ltp.setPassword("Test1234");
		ClosePage();
		
	}

}
