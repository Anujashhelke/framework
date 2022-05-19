package runner;


	import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;



import pageobject.StoresPageObject;
import reusable.WebDriverHelper;
	import utility.BaseClass;
	import utility.ConfigRead;
	import utility.ExtentReport;
	import utility.Snapshot;


		public class TestExecution6 extends BaseClass {
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
				StoresPageObject h=new StoresPageObject(driver);
		       extent.createReport();
				extent.createTest("home page 6");
				snap=new Snapshot();
				extent.logPass("successfully launched");
				Thread.sleep(3000);
				h.clickOnStores();
				Thread.sleep(3000);
				h.textContain("Stores");
				Thread.sleep(3000);
				h.clickOnviewDetails();
				Thread.sleep(3000);
				//h.getLocation();
				h.clickOnLocation();
				Thread.sleep(2000);
				h.getTitle("Urban Ladder");
				Thread.sleep(3000);

	}	
		@AfterClass
			public void close() {
		driver.close();
	}
		
	

}
