package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersOverviewPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminUsersOverviewPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
