package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentDropdownChangePasswordPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentDropdownChangePasswordPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
