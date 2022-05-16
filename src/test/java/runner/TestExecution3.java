package runner;

import java.io.IOException;

import org.testng.annotations.Test;


import pageobject.HomePage3;
import reusable.WebDriverHelper;
import utility.BaseClass;
import utility.ConfigRead;
import utility.ExtentReport;
import utility.Snapshot;


	public class TestExecution3 extends BaseClass {
		public ConfigRead read;
		public static ExtentReport extent;
		
		Snapshot snap;
		String path;
		public WebDriverHelper helper;
	@Test
		public void basePageNavigation() throws InterruptedException, IOException {
			read=new ConfigRead();
			extent =new ExtentReport();
			driver=setUp();
			driver.get(read.getUrl());
			HomePage3 h=new HomePage3(driver);
	       extent.createReport();
			extent.createTest("home page 3");
			snap=new Snapshot();
			extent.logPass("successfully launched");
			h.clickOnLink();
			h.textContain("TERMS OF SHIPPING AND DELIVERY");
			h.stories();
			h.getUserResponse();

}
	
	}
