package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminHighSchoolsOverviewPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminHighSchoolsOverviewPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
