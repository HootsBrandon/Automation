package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentDropdownProfileSettingsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentDropdownProfileSettingsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
