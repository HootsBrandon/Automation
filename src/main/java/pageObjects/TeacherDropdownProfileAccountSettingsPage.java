package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeacherDropdownProfileAccountSettingsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public TeacherDropdownProfileAccountSettingsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
