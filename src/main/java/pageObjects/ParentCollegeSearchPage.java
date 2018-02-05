package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParentCollegeSearchPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public ParentCollegeSearchPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
