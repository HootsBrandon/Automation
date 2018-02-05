package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentCollegeSearchPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentCollegeSearchPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
