package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorCollegesOurCollegesPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorCollegesOurCollegesPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
