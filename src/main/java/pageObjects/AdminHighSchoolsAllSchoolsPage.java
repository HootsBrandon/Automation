package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminHighSchoolsAllSchoolsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminHighSchoolsAllSchoolsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
