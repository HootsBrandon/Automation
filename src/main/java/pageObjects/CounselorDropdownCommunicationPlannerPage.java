package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorDropdownCommunicationPlannerPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorDropdownCommunicationPlannerPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
