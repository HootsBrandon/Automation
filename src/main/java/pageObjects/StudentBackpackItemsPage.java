package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentBackpackItemsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentBackpackItemsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
