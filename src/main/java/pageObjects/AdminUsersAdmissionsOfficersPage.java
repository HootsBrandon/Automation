package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersAdmissionsOfficersPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminUsersAdmissionsOfficersPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
