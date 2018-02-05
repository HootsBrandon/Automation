package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminHighSchoolsInProcessPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminHighSchoolsInProcessPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
