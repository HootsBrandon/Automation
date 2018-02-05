package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorApplicationsSendPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorApplicationsSendPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
