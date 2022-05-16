package runner;


	import java.io.IOException;

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
				gift.hover();
				gift.clickOnChoose();
				gift.getText();
				gift.insertAccount();
				gift.insertDate();
				gift.clickNext();
				gift.sendText("anuja","avni","avni@gmail.com","anuja@gmail.com","657657");
				

}
		}
