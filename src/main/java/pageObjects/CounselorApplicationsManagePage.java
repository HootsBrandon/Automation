package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorApplicationsManagePage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorApplicationsManagePage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
