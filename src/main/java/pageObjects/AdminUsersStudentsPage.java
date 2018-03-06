package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersStudentsPage {

	WebDriver driver;

	// I would like to... Button
	By iwlt = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.btn-group.ng-scope.dropdown > button");

	// Message selector
	By message = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.btn-group.ng-scope.dropdown.open > ul > div > div:nth-child(1) > a");

	// Resend Confermation Selector
	By reConfrim = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.btn-group.ng-scope.dropdown.open > ul > div > div:nth-child(2) > a");

	// Bulk message students title
	By messageTitle = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.bulk-message-modal.in > div > div > div > div.wizard-section.clearfix > div:nth-child(1) > input");

	// Bulk message students body
	By messageBody = By.cssSelector("body > p");

	// Bulk message students
	By messageSend = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.bulk-message-modal.in > div > div > div > div.wizard-actions.clearfix > div > span.btn.btn-primary.save.pull-right");

	// Bulk message students
	By messageCancel = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.bulk-message-modal.in > div > div > div > div.wizard-actions.clearfix > div > span.btn-link.btn.pull-right");

	// Bulk message students
	By messageClose = By
			.cssSelector("body > div.modal.fade.ng-isolate-scope.bulk-message-modal.in > div > div > div > i");

	// Message all button
	By messageAll = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.button-container.ng-scope > a > span");

	// Search field
	By search = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.navbar-right.clearfix > div.pull-left.mleft-15 > div.search.pull-left.clearfix.ng-scope > form > div > input");

	// Search button
	By searchBtn = By.cssSelector("body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.navbar-right.clearfix > div.pull-left.mleft-15 > div.search.pull-left.clearfix.ng-scope > form > div > a > i");
	
	// Show me Button
	By showMe = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.navbar-right.clearfix > div.pull-left.mleft-15 > div.result-toggle.pull-right.page-size.ng-scope > div > button > span");

	// Results button
	By results = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-actions > ul > div.navbar-right.clearfix > div.btn-group.pull-right.mleft-25.col-filter.ng-scope > span.dropdown > button");

	// Delete user
	By deleteUser = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.inner-table-container > table > tbody > tr:nth-child(2) > td.action.ng-scope > a.text-danger > i");

	// Delete user expunge
	By retypeEmail = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.admin-delete-user-modal.in > div > div > div > form > div.wizard-section > input");

	// Delete user cancel
	By expunge = By.cssSelector(
			"body > div.modal.fade.ng-isolate-scope.admin-delete-user-modal.in > div > div > div > form > div.wizard-actions > div > button.btn.btn-danger.pull-right");

	// Delete user close
	By deleteClose = By.cssSelector("#scoir-icon-close > path");

	// Select All
	By selectAll = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.inner-table-container > table > tbody > tr:nth-child(1) > th:nth-child(1) > input[type=\"checkbox\"]");

	// Select first slot
	By selectOne = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.inner-table-container > table > tbody > tr:nth-child(2) > td:nth-child(1) > input");

	// Page selector
	By nextPage = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-footer > ul > li.pagination-next.ng-scope > a");

	// Page selector
	By previousPage = By.cssSelector(
			"body > div.body-wrapper > div.ng-scope > div > div.admin-canvas.ng-scope > div > div > div.ng-scope > div > div > div > div > div.table-footer > ul > li.pagination-prev.ng-scope > a");

	public AdminUsersStudentsPage(WebDriver driver) {

		this.driver = driver;

	}

	public void clickIwlt() {

		driver.findElement(iwlt).click();

	}

	public void clickMessage() {

		driver.findElement(message).click();

	}

	public void clickReConfrim() {

		driver.findElement(reConfrim).click();

	}

	public void MessageTitle() {

		driver.findElement(messageTitle).sendKeys("");

	}

	public void MessageBody() {

		driver.findElement(messageBody).sendKeys("");

	}

	public void clickMessageSend() {

		driver.findElement(messageSend).click();

	}

	public void clickSessageCancel() {

		driver.findElement(messageCancel).click();

	}

	public void clickMessageClose() {

		driver.findElement(messageClose).click();

	}

	public void clickMessageAll() {

		driver.findElement(messageAll).click();

	}

	public void Search() {

		driver.findElement(search).sendKeys("searchBtn");

	}
	
	public void clickSearchBtn() {

		driver.findElement(searchBtn).click();

	}

	public void clickShowMe() {

		driver.findElement(showMe).click();

	}

	public void clickResults() {

		driver.findElement(results).click();

	}

	public void clickDeleteUser() {

		driver.findElement(deleteUser).click();

	}

	public void RetypeEmail() {

		driver.findElement(retypeEmail).sendKeys("");

	}

	public void clickExpunge() {

		driver.findElement(expunge).click();

	}

	public void clickDeleteClose() {

		driver.findElement(deleteClose).click();

	}

	public void clickSelectAll() {

		driver.findElement(selectAll).click();

	}

	public void clickSelectOne() {

		driver.findElement(selectOne).click();

	}

	public void clickNextPage() {

		driver.findElement(nextPage).click();

	}

	public void clickPreviousPage() {

		driver.findElement(previousPage).click();

	}

}
