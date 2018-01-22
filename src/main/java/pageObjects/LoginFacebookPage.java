package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFacebookPage {
	
	WebDriver driver;
	
	//Loging Facebook username
	By username = By.id("email");
	
	//Login Facebook Password
	By password = By.id("pass");
	
	//Login Facebook button
	By loginFacebookButton = By.name("login");
	
	
	public LoginFacebookPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
