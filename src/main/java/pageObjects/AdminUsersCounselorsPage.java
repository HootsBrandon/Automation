package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersCounselorsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminUsersCounselorsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
