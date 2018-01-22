package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentDropdownIdeaBoardsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentDropdownIdeaBoardsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
