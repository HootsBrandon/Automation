package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParentCollegesAnalysisPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public ParentCollegesAnalysisPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
