package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCommunicationsEmailLogsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminCommunicationsEmailLogsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
