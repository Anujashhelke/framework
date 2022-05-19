package runner;


	import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageobject.GiftCollectionPageObject;

	import reusable.WebDriverHelper;
	import utility.BaseClass;
	import utility.ConfigRead;
	import utility.ExtentReport;
	import utility.Snapshot;


		public class TestExecution4 extends BaseClass {
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
				GiftCollectionPageObject gift=new GiftCollectionPageObject(driver);
		       extent.createReport();
				extent.createTest("home page 3");
				snap=new Snapshot();
				extent.logPass("successfully launched");
				gift.clickOnGift();
				Thread.sleep(3000);
				gift.hover();
				Thread.sleep(3000);
				gift.clickOnChoose();
				Thread.sleep(3000);
				gift.getText();
				Thread.sleep(3000);
				gift.insertAccount();
				Thread.sleep(3000);
				gift.insertDate();
				Thread.sleep(3000);
				gift.clickNext();
				Thread.sleep(3000);
				gift.sendText("anuja","avni","avni@gmail.com","anuja@gmail.com","657657");
				Thread.sleep(3000);
				gift.clickConfirm();
     }
		@AfterClass
		public void close() {
			driver.close();
		}
		}
