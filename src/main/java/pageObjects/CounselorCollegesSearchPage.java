package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorCollegesSearchPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorCollegesSearchPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
