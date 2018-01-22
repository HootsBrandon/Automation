package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTwitterPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public LoginTwitterPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
