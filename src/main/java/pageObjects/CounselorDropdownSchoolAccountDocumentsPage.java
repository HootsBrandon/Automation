package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorDropdownSchoolAccountDocumentsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorDropdownSchoolAccountDocumentsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
