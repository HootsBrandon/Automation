package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFacebookPage {
	
	WebDriver driver;
	
	//Loging Facebook username
	By username = By.id("email");
	
	//Login Facebook Password
	By pass = By.id("password");
	
	//Login Facebook button
	By loginFacebookButton = By.name("login");
	
	
	public LoginFacebookPage (WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	//Sets username
	public void setUserId(String userid) {
		
		driver.findElement(username).sendKeys(userid);
		
	}
	
	//Sets User Password
	public void setPassword(String password) {
		
		driver.findElement(pass).sendKeys(password);
		
	}
	
	//Click sign in
	public void clickSignIn() {
		
		driver.findElement(loginFacebookButton).click();;
		
	}

}
