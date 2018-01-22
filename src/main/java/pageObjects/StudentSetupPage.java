package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentSetupPage {
	
	WebDriver driver;
	
	//Student Setup add college feild 
	By addCollege = By.name("college");
	
	//Student Setup next button
	By nextButton = By.cssSelector("#wrapper > div > div > div:nth-child(1) > div.wizard-actions > button > span.md.md-chevron-right");
	
	//Student setup top of page button
	By topPage = By.cssSelector("body > div.body-wrapper > div > div > div > div:nth-child(6) > a > i");
	
	//Student Setup remove college
	By removeCollege = By.cssSelector("#wrapper > div > div > div:nth-child(1) > div.row > div.col-md-7 > ul > li > div.question > div.typeahead-container > div > div > div > i");
	
	
	public StudentSetupPage (WebDriver driver) {
		
		this.driver = driver;
		
	}

}

//#wrapper > div > div > div:nth-child(1) > div.row > div.col-md-7 > ul > li > div.question > div.typeahead-container > div > div > div:nth-child(19) > i
//#wrapper > div > div > div:nth-child(1) > div.row > div.col-md-7 > ul > li > div.question > div.typeahead-container > div > div > div:nth-child(18) > i