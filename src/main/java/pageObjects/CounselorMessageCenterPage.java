package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorMessageCenterPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorMessageCenterPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
