package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	//Login Password
	By pass = By.id("user-password");
	
	//Sign-in Button
	By btnLogin = By.cssSelector("#wrapper > div > div > div > div > div > div.section > div:nth-child(2) > form > div:nth-child(3) > button");
	
	//Forgot Password Button
	By forgotPassword = By.xpath("/forgot_password");
	
	//Creat new account
	By newAccount = By.xpath("/signup");
	
	//Login with Facebook
	By facebook = By.cssSelector("#wrapper > div > div > div > div > div > div.section > div:nth-child(2) > div.social-media-actions > facebook-btn > a");
	
	//Login with Twitter
	By twitter = By.cssSelector("#wrapper > div > div > div > div > div > div.section > div:nth-child(2) > div.social-media-actions > twitter-btn > a");
	
	
	//Constructor
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		
	}
	
	//Sets user ID
	public void setUserId(String userid) {
		
		driver.findElement(username).sendKeys(userid);
		
	}
	
	//Sets User Password
	public void setPassword(String password) {
		
		driver.findElement(pass).sendKeys(password);
		
	}
	
	//Click sign in
	public void clickSignIn() {
		
		driver.findElement(btnLogin).click();;
		
	}

}
