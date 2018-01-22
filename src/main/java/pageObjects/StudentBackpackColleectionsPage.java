package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentBackpackColleectionsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentBackpackColleectionsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
