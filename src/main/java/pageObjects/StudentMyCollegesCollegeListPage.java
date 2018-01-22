package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentMyCollegesCollegeListPage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public StudentMyCollegesCollegeListPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
