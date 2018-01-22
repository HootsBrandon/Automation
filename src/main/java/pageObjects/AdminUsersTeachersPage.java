package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersTeachersPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminUsersTeachersPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
