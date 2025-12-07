package automationcore;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ScreenshotUtility;

public class Base {
	
public WebDriver driver; // webdriver is an interface in selenium.
	
	@BeforeMethod
	public void initializeBrowser()
	{
		driver = new ChromeDriver(); // chromedriver is a class to open chrome
		driver.get("https://groceryapp.uniqassosiates.com/admin/login"); //method to launch url
		driver.manage().window().maximize(); //methods to maximise window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //implicit wait	
	}
	
	@AfterMethod
	public void driverQuit(ITestResult iTestResult) throws IOException {

		if (iTestResult.getStatus() == ITestResult.FAILURE) {

		ScreenshotUtility screenShot = new ScreenshotUtility();
		screenShot.getScreenshot(driver, iTestResult.getName()); // to store the method name of failed test case
		}
		//driver.quit();

		}

}
