package baseObjects;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	WebDriver driver;
	String filePath = "./test-output/Screenshot/";

	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("***********************ERROR: " + result.getName() + " test has failed***********************");
		
		String methodName = result.getName().toString().trim();
		
		takeScreenShot(methodName);
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	public void takeScreenShot(String methodName) {
		// TODO Auto-generated method stub
		driver = SetupAndClose.driver;
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(scrFile, new File(filePath + methodName + ".png"));
			
			System.out.println("***********************Placed screen shot in " + filePath + "***********************");
			
		}
		
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public String getTestClassName(String testName) {
		// TODO Auto-generated method stub
		
		String[] reqTestClassName = testName.split("\\.");
		
		int i = reqTestClassName.length - 1;
		
		System.out.println("Required Test Name: " + reqTestClassName[i]);
		
		return reqTestClassName[i];
		
	}

}
