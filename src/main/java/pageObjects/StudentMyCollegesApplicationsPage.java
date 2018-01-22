package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentMyCollegesApplicationsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentMyCollegesApplicationsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
