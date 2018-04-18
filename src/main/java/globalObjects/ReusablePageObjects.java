package globalObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReusablePageObjects {
	
	WebDriver driver;
	
	
	

	public ReusablePageObjects(WebDriver driver) {

		this.driver = driver;

	}

	public void clickLinkText() {

		driver.findElement(By.linkText("linkText")).click();
		

	}

	public void clickPartialLink() {

		driver.findElement(By.partialLinkText("linkText")).click();

	}

	public void linkSendkeys() {

		driver.findElement(By.linkText("null")).sendKeys("null");

	}

	public void linkPartialSendKeys() {

		driver.findElement(By.partialLinkText("linkText")).sendKeys("null");

	}

}
