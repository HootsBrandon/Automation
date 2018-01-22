package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentDropdownProfilePersonalPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentDropdownProfilePersonalPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
