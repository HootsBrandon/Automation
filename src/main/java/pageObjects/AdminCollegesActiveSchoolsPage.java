package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCollegesActiveSchoolsPage {

	WebDriver driver;

	// Search
	By search = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div > div.table-actions > ul > div > div.pull-left.mleft-15 > div.search.pull-left.clearfix.ng-scope > form > div > input");

	// Button to determine search results per page
	By showMe = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div > div.table-actions > ul > div > div.pull-left.mleft-15 > div.result-toggle.pull-right.page-size.ng-scope > div > button > span");

	// value of show me
	By twentyFive = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div > div.table-actions > ul > div > div.pull-left.mleft-15 > div.result-toggle.pull-right.page-size.ng-scope > div > ul > li:nth-child(1)");

	// Results filter
	By results = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown > button > i");

	// Display college name
	By college = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown.open > ul > li:nth-child(1) > label > span");

	// Display city
	By city = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown.open > ul > li:nth-child(2) > label > span");

	// Display state
	By state = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown.open > ul > li:nth-child(3) > label > span");

	// Display last delivery method
	By lastDeliveryMethod = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown.open > ul > li:nth-child(4) > label > span");

	// Display pending batches
	By pendingBatches = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown.open > ul > li:nth-child(5) > label > span");

	// Display docs delivered
	By docsDelivered = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown.open > ul > li:nth-child(6) > label > span");

	// Loging username
	By lastActivityspace = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown.open > ul > li:nth-child(7) > label > span");


	public AdminCollegesActiveSchoolsPage(WebDriver driver) {

		this.driver = driver;

	}

	public void search() {

		driver.findElement(search).sendKeys("Blank");
		;

	}

	public void clickShowMe() {

		driver.findElement(showMe).click();

	}

	public void clickTwentyFive() {

		driver.findElement(twentyFive).click();

	}

	public void clickResults() {

		driver.findElement(results).click();

	}

	public void clickCollege() {

		driver.findElement(college).click();

	}

	public void clickCity() {

		driver.findElement(city).click();

	}

	public void clickState() {

		driver.findElement(state).click();

	}

	public void clickLastDeliveryMethod() {

		driver.findElement(lastDeliveryMethod).click();

	}

	public void clickPendingBatches() {

		driver.findElement(pendingBatches).click();

	}

	public void clickDocsDelivered() {

		driver.findElement(docsDelivered).click();

	}

	public void clickLastActivityspace() {

		driver.findElement(lastActivityspace).click();
 
	}

}
