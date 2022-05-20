package runner;


	import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


import pageobject.LoginPage;
import reusable.WebDriverHelper;
		import utility.BaseClass;
		import utility.ConfigRead;
import utility.ExcelRead;
import utility.ExtentReport;
		import utility.Snapshot;


			public class LoginTestExecution5 extends BaseClass {
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
					LoginPage l=new LoginPage(driver);
					ArrayList<String> data=excel.excelTest(read.getExcelPath());
			       extent.createReport();
					extent.createTest("home page 3");
					snap=new Snapshot();
					extent.logPass("successfully launched");
					l.hover();
					l.login();
					l.enterEmail(data.get(0));
					l.enterPass(data.get(1));
					l.submit();
					Thread.sleep(2000);
					l.errorGet();
					//Thread.sleep(2000);
					l.submit();
					l.requiredField();
					


			}
			@AfterClass
			public void close() {
				driver.close();
			}
			}
