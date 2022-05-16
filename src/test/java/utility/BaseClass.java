package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {
	public static WebDriver driver;
	ConfigRead read;
	public static ExtentTest test;
	public static ExtentReport extent;
	String path;
	
	@BeforeClass
	public WebDriver setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Mavenms2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
		
	}
	@AfterTest
	public void close() {
	       
			extent=new ExtentReport();
			extent.endReport();
			extent.logFail(path);
			driver.close();
	}

}
