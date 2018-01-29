package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseOjects {
	
	public static WebDriver driver = null;
	
	@BeforeTest
	public void setup() throws IOException {
		
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("/Users/brandonhoots/Automation/Automation/src/test/java/studentLoginTest/Global.properties");
		p.load(file);
		p.getProperty("browser");
		
		if (p.getProperty("browser").contains("chrome")) {
			
			//Chrome
			System.setProperty("webdriver.chrome.driver", "/Users/brandonhoots/Webdrivers/chromedriver");
			driver = new ChromeDriver();
			
		}
		
		else {
			
			//Firefox
			System.setProperty("webdriver.chrome.driver", "/Users/brandonhoots/Webdrivers/geckodriver");
			driver = new FirefoxDriver();
		}
		
/*		else {
			
			//Internet explorer
			System.setProperty("webdriver.chrome.driver", "/Users/brandonhoots/Webdrivers/geckodriver");
			driver = new FirefoxDriver();
			
		}*/
		
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
