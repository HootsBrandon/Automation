package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentDropdownProfileTestScoresPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentDropdownProfileTestScoresPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
