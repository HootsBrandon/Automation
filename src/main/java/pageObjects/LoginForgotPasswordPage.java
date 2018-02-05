package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginForgotPasswordPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public LoginForgotPasswordPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
