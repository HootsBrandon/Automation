package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorDropdownSchoolAccountSettingsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorDropdownSchoolAccountSettingsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
