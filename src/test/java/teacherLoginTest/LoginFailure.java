package teacherLoginTest;

import java.io.IOException;

import org.testng.annotations.Test;

import baseObjects.SetupAndClose;
import pageObjects.LoginPage;

public class LoginFailure extends SetupAndClose {

	@Test(groups= {"Regression"})
	public void Failure() throws IOException {
		
		Setup();
		LoginPage lp = new LoginPage(driver);
		lp.setUserId("WrongTeacher@scoir.com");
		lp.setPassword("1234");
		lp.clickSignIn();
		ClosePage();
		
	}

}
