package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import pageobject.Homepage;
import reusable.WebDriverHelper;
import utility.BaseClass;
import utility.ConfigRead;
import utility.ExtentReport;
import utility.Snapshot;



public class TestExecution1 extends BaseClass {
	public ConfigRead read;
	public static ExtentReport extent;
	public ExtentTest test;
	Snapshot snap;
	String path;
	public WebDriverHelper helper;
	@Test
	public void basePageNavigation() throws InterruptedException, IOException {
		read=new ConfigRead();
		extent =new ExtentReport();
		driver=setUp();
		driver.get("https://www.urbanladder.com");
		Homepage h=new Homepage(driver);
       extent.createReport();
		test=extent.createTest("home page 1");
		snap=new Snapshot();
		extent.logPass("successfully launched");
		
		Thread.sleep(3000);
		//h.closePopUp();
		Thread.sleep(3000);
		h.clickOnSearch();
		Thread.sleep(3000);
		h.sendText();
		Thread.sleep(3000);
		h.clickOnEnter();
		Thread.sleep(3000);
		h.closePopup();
		Thread.sleep(3000);
		h.verifyProduct();
		path=snap.takeSnapshot(driver);
		extent.logPass(path);
		//h.textContain();
		
	}
	@AfterClass
	public void close() {
		driver.close();
	}
	
	}


