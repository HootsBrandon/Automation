package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersAdminsPage {

	WebDriver driver;

	// I would like to... Button
	By iwlt = By.cssSelector(
			"");

	// Message dropdown
	By message = By.cssSelector(
			"");

	// Bulk message title
	By title = By.cssSelector(
			"");

	// Bulk message body
	By body = By.cssSelector("");

	// Message All
	By messageAll = By.cssSelector(
			"");

	// Send bulk message
	By send = By.cssSelector(
			"");

	// Cancel bulk message
	By cancel = By.cssSelector(
			"");

	// Close bulk message
	By close = By.cssSelector("");

	// Search field
	By search = By.cssSelector(
			"");

	// Search Button
	By searchBtn = By.cssSelector(
			"");

	// Delete user
	By delete = By.cssSelector("");

	// Select all
	By selectAll = By.cssSelector("");

	// Select One
	By select = By.cssSelector("");

	// Next page
	By next = By.cssSelector("");

	// Previous Page
	By previous = By.cssSelector("");

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

	public AdminUsersAdminsPage(WebDriver driver) {

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