package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorStudentsScholarshipsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorStudentsScholarshipsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
