package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorDropdownProfileAccountSettingsStaffPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorDropdownProfileAccountSettingsStaffPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
