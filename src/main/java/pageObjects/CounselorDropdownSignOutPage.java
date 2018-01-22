package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorDropdownSignOutPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorDropdownSignOutPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
