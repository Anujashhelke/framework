package runner;

	import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.Test;

	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;

import pageobject.ApplyNowPageObject;
import pageobject.Homepage;
	import reusable.WebDriverHelper;
	import utility.BaseClass;
	import utility.ConfigRead;
	import utility.ExtentReport;
	import utility.Snapshot;



	public class TestExecution extends BaseClass {
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
			driver.get(read.getUrl());
			ApplyNowPageObject h=new ApplyNowPageObject(driver);
			 extent.createReport();
			extent.createTest(getClass().getSimpleName());
			snap=new Snapshot();
			
			path=snap.takeSnapshot(driver);
			
			extent.logPass("successfully launched");
			h.clickOnCarriers();
			Thread.sleep(3000);
			h.clickOnApply();
			Thread.sleep(3000);
			
			h.clickOnApply2();
			Thread.sleep(3000);
			extent.logPass(path);
			extent.endReport();
			
			
			
		}
		  @AfterMethod
		public void closeTest() {
			close();
			driver.close();
		}
		
		}




