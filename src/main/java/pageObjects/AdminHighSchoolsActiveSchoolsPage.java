package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminHighSchoolsActiveSchoolsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminHighSchoolsActiveSchoolsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
