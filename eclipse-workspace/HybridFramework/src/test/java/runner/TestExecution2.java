package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageobject.HomePage2;
import pageobject.Homepage;
import reusable.WebDriverHelper;
import utility.BaseClass;
import utility.ConfigRead;
import utility.ExtentReport;
import utility.Snapshot;


	public class TestExecution2 extends BaseClass {
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
			driver.get("https://www.urbanladder.com");
			HomePage2 h=new HomePage2(driver);
	       extent.createReport();
			extent.createTest("home page 2");
			snap=new Snapshot();
			extent.logPass("successfully launched");
			h.hover();
			Thread.sleep(3000);
			h.clickOnLaptop();
			Thread.sleep(3000);
			h.closePopup();
			Thread.sleep(3000);
			h.hoverOnProduct();
			Thread.sleep(3000);
			h.clickOnAdd();
			Thread.sleep(3000);
			h.addToCart();
			Thread.sleep(3000);
			h.quantity();
			Thread.sleep(3000);
			h.Price();
			Thread.sleep(3000);
			h.checkout();
			Thread.sleep(3000);
			h.addDetails();
			Thread.sleep(3000);
			extent.endReport();
			

}
	@AfterMethod
	public void quite() {
		driver.close();
	}
	}

