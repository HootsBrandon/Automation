package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorReportsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorReportsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
