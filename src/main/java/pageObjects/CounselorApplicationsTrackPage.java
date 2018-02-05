package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorApplicationsTrackPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorApplicationsTrackPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
