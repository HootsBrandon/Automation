package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorDropdownPersonalProfilePage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorDropdownPersonalProfilePage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
