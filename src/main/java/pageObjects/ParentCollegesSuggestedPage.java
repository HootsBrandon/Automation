package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParentCollegesSuggestedPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public ParentCollegesSuggestedPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
