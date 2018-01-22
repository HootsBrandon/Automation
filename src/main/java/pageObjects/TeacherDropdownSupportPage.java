package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeacherDropdownSupportPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public TeacherDropdownSupportPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
