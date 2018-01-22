package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CounselorStudentsScolarshipsPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public CounselorStudentsScolarshipsPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
