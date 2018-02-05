package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersAdminsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminUsersAdminsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
