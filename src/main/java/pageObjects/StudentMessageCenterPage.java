package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentMessageCenterPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentMessageCenterPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
