package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParentDropdownAccountPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public ParentDropdownAccountPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
