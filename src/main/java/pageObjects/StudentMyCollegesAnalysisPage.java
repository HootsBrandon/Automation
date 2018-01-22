package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentMyCollegesAnalysisPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentMyCollegesAnalysisPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
