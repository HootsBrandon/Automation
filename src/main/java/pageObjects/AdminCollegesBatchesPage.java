package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCollegesBatchesPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminCollegesBatchesPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
