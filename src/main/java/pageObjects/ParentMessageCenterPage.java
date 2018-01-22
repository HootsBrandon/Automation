package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParentMessageCenterPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public ParentMessageCenterPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
