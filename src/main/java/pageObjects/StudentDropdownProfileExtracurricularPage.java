package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentDropdownProfileExtracurricularPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentDropdownProfileExtracurricularPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
