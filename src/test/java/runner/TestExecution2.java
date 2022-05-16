package runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
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
			h.closePopup();
			h.hoverOnProduct();
			h.clickOnAdd();
			h.addToCart();
			h.quantity();
			h.Price();
			h.checkout();
			h.addDetails();
			

}
	@AfterClass
	public void close() {
		driver.close();
	}
	}
