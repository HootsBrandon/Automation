package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersCounselorsPage {

	WebDriver driver;

	// I would like to... Button
	By iwlt = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.btn-group.ng-scope.dropdown > button");

	// Message dropdown
	By message = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.btn-group.ng-scope.dropdown.open > ul > div > div > a");

	// Bulk message title
	By title = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.bulk-message-modal.in > div > div > div > div.wizard-section.clearfix > div:nth-child(1) > input");

	// Bulk message body
	By body = By.cssSelector("body > p");

	// Add counselor
	By addCounselor = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.button-container.ng-scope > a:nth-child(1) > span");

	// First Name
	By fName = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.create-counselor-modal.in > div > div > div > form > div.wizard-section > div > div:nth-child(1) > input");

	// Last name
	By lName = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.create-counselor-modal.in > div > div > div > form > div.wizard-section > div > div:nth-child(2) > input");

	// Email
	By email = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.create-counselor-modal.in > div > div > div > form > div.wizard-section > div > div:nth-child(3) > input");

	// High School
	By hs = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.create-counselor-modal.in > div > div > div > form > div.wizard-section > div > div:nth-child(4) > div > admin-high-school-typeahead > detailed-typeahead > div > input");

	// Save counselor add
	By saveCounselor = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.create-counselor-modal.in > div > div > div > form > div.wizard-actions.clearfix > div.pull-right > button");

	// Cancel counselor add
	By cancelCounselor = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.create-counselor-modal.in > div > div > div > form > div.wizard-actions.clearfix > div.pull-right > a");

	// Close counselor add
	By closeCounselor = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.create-counselor-modal.in > div > div > div > form > div.wizard-section > scoir-icon > svg");

	// Export
	By export = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.button-container.ng-scope > a:nth-child(2)");

	// Add counselor
	By messageAll = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.button-container.ng-scope > a:nth-child(3) > span");

	// Send bulk message
	By send = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.bulk-message-modal.in > div > div > div > div.wizard-actions.clearfix > div > span.btn.btn-primary.save.pull-right");

	// Cancel bulk message
	By cancel = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.bulk-message-modal.in > div > div > div > div.wizard-actions.clearfix > div > span.btn-link.btn.pull-right");

	// Close bulk message
	By close = By.cssSelector("body > div.modal.fade.ng-isolate-scope.bulk-message-modal.in > div > div > div > i");

	// Search field
	By search = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.navbar-right.clearfix > div.pull-left.mleft-15 > div.search.pull-left.clearfix.ng-scope > form > div > input");

	// Search Button
	By searchBtn = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.navbar-right.clearfix > div.pull-left.mleft-15 > div.search.pull-left.clearfix.ng-scope > form > div > a > i");

	// Delete user
	By delete = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.inner-table-container > table > tbody > tr:nth-child(2) > td.action.ng-scope > a.text-danger > span");

	// Select all
	By selectAll = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.inner-table-container > table > tbody > tr:nth-child(1) > th:nth-child(1) > input[type=\"checkbox\"]");

	// Select One
	By select = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.inner-table-container > table > tbody > tr:nth-child(2) > td:nth-child(1) > input");

	// Next page
	By next = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-footer > ul > li.pagination-next.ng-scope > a");

	// Previous Page
	By previous = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-footer > ul > li.pagination-prev.ng-scope.disabled > a");

	// // Loging username
	// By username = By.cssSelector("");
	//
	// // Loging username
	// By username = By.cssSelector("");
	//
	// // Loging username
	// By username = By.cssSelector("");

	// wio
	By wio = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > advanced-search > div.filter-container > div > div.toggle");

	public AdminUsersCounselorsPage(WebDriver driver) {

		this.driver = driver;

	}

	public void clickIwlt() {

		driver.findElement(iwlt).click();

	}

	public void clickMessage() {

		driver.findElement(message).click();

	}

	public void clickTitle() {

		driver.findElement(title).sendKeys();

	}

	public void clickBody() {

		driver.findElement(body).sendKeys();

	}

	public void clickAddCounselor() {

		driver.findElement(addCounselor).click();

	}

	public void clickFName() {

		driver.findElement(fName).sendKeys();

	}

	public void clickLName() {

		driver.findElement(lName).sendKeys();

	}

	public void clickEmail() {

		driver.findElement(email).sendKeys();

	}

	public void clickHs() {

		driver.findElement(hs).sendKeys();

	}

	public void clickSaveCounselor() {

		driver.findElement(saveCounselor).click();

	}

	public void clickCancelCounselor() {

		driver.findElement(cancelCounselor).click();

	}

	public void clickCloseCounselor() {

		driver.findElement(closeCounselor).click();

	}

	public void clickExport() {

		driver.findElement(export).click();

	}

	public void clickMessageAll() {

		driver.findElement(messageAll).click();

	}

	public void clickSend() {

		driver.findElement(send).click();

	}

	public void clickCancel() {

		driver.findElement(cancel).click();

	}

	public void clickClose() {

		driver.findElement(close).click();

	}

	public void clickSearch() {

		driver.findElement(search).sendKeys();

	}

	public void clickSearchBtn() {

		driver.findElement(searchBtn).click();

	}

	public void clickDelete() {

		driver.findElement(delete).click();

	}

	public void clickSelectAll() {

		driver.findElement(selectAll).click();

	}

	public void clickSelect() {

		driver.findElement(select).click();

	}

	public void clickNext() {

		driver.findElement(next).click();

	}

	public void clickPrevious() {

		driver.findElement(previous).click();

	}

	public void clickWio() {

		driver.findElement(wio).click();

	}

}