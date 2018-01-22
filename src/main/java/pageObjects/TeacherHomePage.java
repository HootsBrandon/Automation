package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeacherHomePage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public TeacherHomePage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
