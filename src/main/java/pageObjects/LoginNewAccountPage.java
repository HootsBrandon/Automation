package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginNewAccountPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public LoginNewAccountPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
