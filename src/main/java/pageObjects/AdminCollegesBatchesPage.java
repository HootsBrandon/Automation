package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminCollegesBatchesPage {

	WebDriver driver;

	// Documents by high school
	By docsByHS = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div.high-school-filter-wrapper.clearfix > span.typeahead-wrapper > div > div > input");

	// Search
	By search = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div.ng-isolate-scope > div > div.table-actions > ul > div > div.pull-left.mleft-15 > div.search.pull-left.clearfix.ng-scope > form > div > input");

	// Button to determine search results per page
	By showMe = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div.ng-isolate-scope > div > div.table-actions > ul > div > div.pull-left.mleft-15 > div.result-toggle.pull-right.page-size.ng-scope > div > button");

	// value of show me
	By fifty = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div.ng-isolate-scope > div > div.table-actions > ul > div > div.pull-left.mleft-15 > div.result-toggle.pull-right.page-size.ng-scope > div > ul > li:nth-child(2)");

	// Results filter
	By results = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div.ng-isolate-scope > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown > button > i");

	// Display college name
	By college = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div.ng-isolate-scope > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown.open > ul > li:nth-child(1) > label > span");

	// Display high school
	By highSchool = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div.ng-isolate-scope > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown.open > ul > li:nth-child(2) > label > span");

	// Display batch date
	By batchDate = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div.ng-isolate-scope > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown.open > ul > li:nth-child(3) > label > span");

	// Display status
	By status = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div.ng-isolate-scope > div > div.table-actions > ul > div > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown.open > ul > li:nth-child(4) > label > span");

	// Force Generate button
	By forceGenerate = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div.high-school-filter-wrapper.clearfix > button > scoir-icon > svg");

	// Dissagree to force generate
	By forceNo = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.action-buttons-wrapper.clearfix > div > a.btn.btn-link");

	// Agree to force generate
	By forceYes = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.action-buttons-wrapper.clearfix > div > a.btn.btn-primary");

	// Download button
	By download = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div.ng-isolate-scope > div > div.inner-table-container > table > tbody > tr:nth-child(2) > td.action.ng-scope > a > span");

	public AdminCollegesBatchesPage(WebDriver driver) {

		this.driver = driver;

	}

	public void clickDocsByHS() {

		driver.findElement(docsByHS).click();

	}

	public void clickSearch() {

		driver.findElement(search).click();

	}

	public void clickShowMe() {

		driver.findElement(showMe).click();

	}

	public void clickFifty() {

		driver.findElement(fifty).click();

	}

	public void clickResults() {

		driver.findElement(results).click();

	}

	public void clickCollege() {

		driver.findElement(college).click();

	}

	public void clickHighSchool() {

		driver.findElement(highSchool).click();

	}

	public void clickBatchDate() {

		driver.findElement(batchDate).click();

	}

	public void clickStatus() {

		driver.findElement(status).click();

	}

	public void clickForceGenerate() {

		driver.findElement(forceGenerate).click();

	}

	public void clickForceNo() {

		driver.findElement(forceNo).click();

	}

	public void clickForceYes() {

		driver.findElement(forceYes).click();

	}

	public void clickDownload() {

		driver.findElement(download).click();

	}

}
