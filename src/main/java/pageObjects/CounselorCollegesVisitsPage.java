package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorCollegesVisitsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorCollegesVisitsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
