package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParentCollegesFavoritePage {
	
	WebDriver driver;
	
	//Loging username
	By username = By.id("user-email");
	
	
	
	public ParentCollegesFavoritePage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
