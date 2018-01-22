package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorStudentsRosterPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorStudentsRosterPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
