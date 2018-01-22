package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentSetupSecondPage2 {
	
	WebDriver driver;
	
	//Student Setup personal intrests
	By addCollege = By.cssSelector("#wrapper > div > div > div:nth-child(2) > div.row > div.col-md-7 > div.questions-wrapper > div:nth-child(1) > div.question > div.answer-wrapper > div > div > input");
	
	//Student Setup academic intrests
	By nextButton = By.cssSelector("#wrapper > div > div > div:nth-child(2) > div.row > div.col-md-7 > div.questions-wrapper > div.question-wrapper.clearfix.majors > div.question > div.answer-wrapper > div > div > input");
	
	//Student setup top of page button
	By topPage = By.cssSelector("body > div.body-wrapper > div > div > div > div:nth-child(6) > a > i");
	
	//Student Setup finish button
	By removeCollege = By.cssSelector("#wrapper > div > div > div:nth-child(2) > div.wizard-actions > button");
	
	
	public StudentSetupSecondPage2 (WebDriver driver) {
		
		this.driver = driver;
		
	}

}

//#wrapper > div > div > div:nth-child(1) > div.row > div.col-md-7 > ul > li > div.question > div.typeahead-container > div > div > div:nth-child(19) > i
//#wrapper > div > div > div:nth-child(1) > div.row > div.col-md-7 > ul > li > div.question > div.typeahead-container > div > div > div:nth-child(18) > i