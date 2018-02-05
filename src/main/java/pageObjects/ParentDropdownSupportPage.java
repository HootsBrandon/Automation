package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParentDropdownSupportPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public ParentDropdownSupportPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
