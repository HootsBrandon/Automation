package webLogin;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentLogin {


	@Test // Each @Test is treated as a new test
	public void LoginSuccess() {
		
	}
	
	@Test
	public void LoginFailure() {
		
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void LoginFacebookSuccess() {
		
	}
	
	@Test
	public void LoginFacebookFailure() {
		
	}
	
	@Test
	public void LoginTwitterSuccess() {
		
	}
	
	@Test
	public void LoginTwitterFailure() {
		
	}
	
}
