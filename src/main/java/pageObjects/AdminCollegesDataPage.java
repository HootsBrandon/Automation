package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCollegesDataPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public AdminCollegesDataPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
