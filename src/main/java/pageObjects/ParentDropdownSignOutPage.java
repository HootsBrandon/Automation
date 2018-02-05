package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParentDropdownSignOutPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public ParentDropdownSignOutPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
