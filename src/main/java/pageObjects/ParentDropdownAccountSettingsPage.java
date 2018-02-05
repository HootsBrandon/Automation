package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParentDropdownAccountSettingsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public ParentDropdownAccountSettingsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
