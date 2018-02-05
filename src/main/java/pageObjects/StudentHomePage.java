package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentHomePage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentHomePage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
