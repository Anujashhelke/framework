package runner;


	import java.io.IOException;

import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterClass;
    import org.testng.annotations.Test;

import pageobject.ProductDetailsPageObject;
import pageobject.StoresPageObject;
	import reusable.WebDriverHelper;
		import utility.BaseClass;
		import utility.ConfigRead;
		import utility.ExtentReport;
		import utility.Snapshot;


			public class TestExecution7 extends BaseClass {
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
					ProductDetailsPageObject h=new ProductDetailsPageObject (driver);
			       extent.createReport();
					extent.createTest("home page 6");
					snap=new Snapshot();
					extent.logPass("successfully launched");
					h.hoverOndecor();
					//Thread.sleep(3000);
					h.clickOnDoormat();
					h.closePopup();
					h.hoverOnRecommended();
					
					//Thread.sleep(3000);
					//h.clickOnArrival();
					Thread.sleep(3000);
					h.clickOnProduct();
					Thread.sleep(2000);
					h.textContains("Kyra Door Mat");
					Thread.sleep(3000);

		}	
			@AfterClass
				public void close() {
			driver.close();
		}
			
		


}
