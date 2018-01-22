package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCommunicationsBannerAlertsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminCommunicationsBannerAlertsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
