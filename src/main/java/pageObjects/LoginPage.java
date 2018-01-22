package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	//Login Password
	By password = By.id("user-password");
	
	//Sign-in Button
	By btnLogin = By.className("btn btn-primary btn-signin");
	
	//Forgot Password Button
	//By forgotPassword = By.xpath("/forgot_password");
	
	//Creat new account
	//By newAccount = By.xpath("/signup");
	
	//Login with Facebook
	//By facebook = By.cssSelector("#wrapper > div > div > div > div > div > div.section > div:nth-child(2) > div.social-media-actions > facebook-btn > a");
	
	//Login with Twitter
	//By twitter = By.cssSelector("#wrapper > div > div > div > div > div > div.section > div:nth-child(2) > div.social-media-actions > twitter-btn > a");
	
	
	
	public LoginPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
