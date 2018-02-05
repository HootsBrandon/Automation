package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeacherDropdownSignOutPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public TeacherDropdownSignOutPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
