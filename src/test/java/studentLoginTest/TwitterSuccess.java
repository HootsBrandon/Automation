package studentLoginTest;

import org.testng.annotations.Test;

import pageObjects.BaseOjects;
import pageObjects.LoginPage;
import pageObjects.LoginTwitterPage;

public class TwitterSuccess extends BaseOjects {

	@Test
	public void LoginTwitterSuccess() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		LoginTwitterPage ltp = new LoginTwitterPage(driver);
		
		lp.clickTwitterSignIn();
		driver.wait(3000);
		ltp.setUserId("Bhoots+Twitter@scoir.com");
		ltp.setPassword("Test1234");
		
	}
	
/*	@AfterTest
	public void end() {
		
	driver.quit();
	
	}*/

}
