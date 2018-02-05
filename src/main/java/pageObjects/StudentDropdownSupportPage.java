package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentDropdownSupportPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentDropdownSupportPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
