package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminUsersAdmissionsOfficersPage {

	WebDriver driver;

	// I would like to... Button
	By iwlt = By.cssSelector("");
	
	// Message dropdown
	By message = By.cssSelector("");
	
	// Bulk message title
	By title = By.cssSelector("");

	// Bulk message body
	By body = By.cssSelector("");

	// Add counselor
	By addCounselor = By.cssSelector("");

	// First Name
	By fName = By.cssSelector(
			"");

	// Last name
	By lName = By.cssSelector(
			"");

	// Email
	By email = By.cssSelector(
			"");

	// High School
	By hs = By.cssSelector(
			"");

	// Save counselor add
	By saveCounselor = By.cssSelector(
			"");

	// Cancel counselor add
	By cancelCounselor = By.cssSelector(
			"");

	// Close counselor add
	By closeCounselor = By.cssSelector(
			"");

	// Export
	By export = By.cssSelector(
			"");

	// Add counselor
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
	By search = By.cssSelector("");

	// Search Button
	By searchBtn = By.cssSelector("");

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

	public AdminUsersAdmissionsOfficersPage(WebDriver driver) {

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