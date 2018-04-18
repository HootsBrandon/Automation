package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCollegesDataPage {

	WebDriver driver;
 
	// Reseed all
	By reseedAll = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > form > div.data-scope-control > h2 > span.btn-group > label:nth-child(1)");

	// Reseed selected
	By reseedSelect = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > form > div.data-scope-control > h2 > span.btn-group > label:nth-child(2)");

	// Executes reseeding
	By execute = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > form > div.reseed-wrapper > button");

	// College Name
	By findCollege = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > form > div.ng-scope > div > college-typeahead > input");

	// College Scid
	By scid = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > form > div.ng-scope > div > div.input-group > input");

	// Add Scid
	By addScid = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > form > div.ng-scope > div > div.input-group > span > button");

	// add college
	By addCollege = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > form > div.ng-scope > button");

	// Execute Success
	By success = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > form > div.reseed-wrapper > span");

	public AdminCollegesDataPage(WebDriver driver) {

		this.driver = driver;

	}

	public void clickReseedAll() {

		driver.findElement(reseedAll).click();

	}

	public void clickReseedSelect() {

		driver.findElement(reseedSelect).click();

	}

	public void clickExecute() {

		driver.findElement(execute).click();

	}

	public void findCollege() {

		driver.findElement(findCollege).sendKeys("West Chester");
		;

	}

	public void scid() {

		driver.findElement(scid).sendKeys("1234");
		;

	}

	public void clickAddScid() {

		driver.findElement(addScid).click();

	}

	public void clickAddCollege() {

		driver.findElement(addCollege).click();

	}

	public void clickSuccess() {

		driver.findElement(success).click();

	}

}
