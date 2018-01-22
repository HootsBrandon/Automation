package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCommunicationsOutboxPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminCommunicationsOutboxPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
