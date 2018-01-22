package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFacebookSecondPage {
	
	WebDriver driver;
	
	//Loging Facebook School State
	By username = By.name("myState");
	
	//Login Facebook High School Name
	By password = By.cssSelector("#wrapper > div > div > div.ng-scope > div > div.confirm-page-wrapper > div > div > div > div > form > additional-registration-information > div > div.col-sm-8.ng-scope > other-high-school-typeahead > detailed-typeahead > div > input");
	
	//Login Facebook Not a student button
	By loginFacebookButton = By.name("notAttending");
	
	//Login Facebook Finish button
	By facebookFinishButton = By.cssSelector("#wrapper > div > div > div.ng-scope > div > div.confirm-page-wrapper > div > div > div > div > form > div.wizard-actions.text-center > button");
	
	
	public LoginFacebookSecondPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}
