package runner;


	
	import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageobject.HelpCenter;
import pageobject.LoginPage;
	import reusable.WebDriverHelper;
			import utility.BaseClass;
			import utility.ConfigRead;
	import utility.ExcelRead;
	import utility.ExtentReport;
			import utility.Snapshot;


				public class TestExecution8 extends BaseClass {
					public ConfigRead read;
					public static ExtentReport extent;
					public ExcelRead excel;
					
					Snapshot snap;
					String path;
					public WebDriverHelper helper;
				@Test
					public void basePageNavigation() throws InterruptedException, IOException {
						read=new ConfigRead();
						extent =new ExtentReport();
						excel=new ExcelRead();
						
						driver=setUp();
						driver.get(read.getUrl());
						HelpCenter l=new HelpCenter(driver);
						extent.createReport();
						extent.createTest("home page 3");
						snap=new Snapshot();
						extent.logPass("successfully launched");
						l.clickOnHelp();
					     Thread.sleep(3000);
					     l.clickOnLink();
					     Thread.sleep(2000);
					     l.getText("Cancellations and Returns");
						


				}
				@AfterMethod
				public void close() {
					driver.close();
				}
				}


