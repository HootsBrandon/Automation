package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTwitterPage {
	
	WebDriver driver;
	
	//Loging Twitter username
	By username = By.id("username_or_email");

	//Login Twitter Password
	By pass = By.id("password");
	
	//Login Twitter button
	By loginTwitterButton = By.id("allow");
	
	
	
	public LoginTwitterPage (WebDriver driver) {
		
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
		
		driver.findElement(loginTwitterButton).click();;
		
	}

}
