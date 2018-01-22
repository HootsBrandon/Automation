package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorDropdownSchoolAccountPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorDropdownSchoolAccountPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
