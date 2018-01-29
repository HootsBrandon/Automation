package teacherLoginTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObjects.BaseOjects;
import pageObjects.LoginPage;

public class LoginFailure extends BaseOjects {

	@Test
	public void Failure() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserId("WrongTeacher@scoir.com");
		lp.setPassword("1234");
		lp.clickSignIn();
		
	}
	
	@AfterTest
	public void end() {
		
	driver.quit();
	
	}

}
