package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersTeachersPage {

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

	// Message All
	By messageAll = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.button-container.ng-scope > a > span");

	// Send bulk message
	By send = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.bulk-message-modal.in > div > div > div > div.wizard-actions.clearfix > div > span.btn.btn-primary.save.pull-right");

	// Cancel bulk message
	By cancel = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.bulk-message-modal.in > div > div > div > div.wizard-actions.clearfix > div > span.btn-link.btn.pull-right");

	// Close bulk message
	By close = By.cssSelector("body > div.modal.fade.ng-isolate-scope.bulk-message-modal.in > div > div > div > i");

	// Search field
	By search = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.navbar-right.clearfix > div.pull-left.mleft-15 > div.search.pull-left.clearfix.ng-scope > form > div > input");

	// Search Button
	By searchBtn = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.navbar-right.clearfix > div.pull-left.mleft-15 > div.search.pull-left.clearfix.ng-scope > form > div > a > i");

	// User code
	By code = By.ByTagName.linkText("Code");

	// Select all
	By selectAll = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.inner-table-container > table > tbody > tr:nth-child(1) > th:nth-child(1) > input[type=\"checkbox\"]");

	// Select One
	By select = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.inner-table-container > table > tbody > tr:nth-child(2) > td:nth-child(1) > input");

	// Next page
	By next = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-footer > ul > li.pagination-next.ng-scope > a");

	// Previous Page
	By previous = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-footer > ul > li.pagination-prev.ng-scope > a");

//	// Loging username
//	By username = By.cssSelector("");
//
//	// Loging username
//	By username = By.cssSelector("");
//
//	// Loging username
//	By username = By.cssSelector("");

	// wio
	By wio = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > advanced-search > div.filter-container > div > div.toggle");


	public AdminUsersTeachersPage(WebDriver driver) {

		this.driver = driver;

	}

	public void clickIwlt() {

		driver.findElement(iwlt).click();

	}

	public void clickMessage() {

		driver.findElement(message).click();

	}

	public void clickTitle() {

		driver.findElement(title).click();

	}

	public void clickBody() {

		driver.findElement(body).click();

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

		driver.findElement(search).click();

	}

	public void clickSearchBtn() {

		driver.findElement(searchBtn).click();

	}

	public void clickUserCode() {

		driver.findElement(code).click();

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