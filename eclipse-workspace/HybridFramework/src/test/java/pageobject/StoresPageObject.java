package pageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import reusable.WebDriverHelper;
import uistore.StoresUi;
import utility.ExtentReport;
import utility.Logs;

public class StoresPageObject {

	
		public static WebDriverHelper helper;
		public static WebDriver driver;
		Logs logUtil;
		Logger log;
		
			public ExtentReport extent;
		
			public StoresPageObject(WebDriver driver) {
				 helper=new WebDriverHelper();
				 this.driver=driver;
				 logUtil=new Logs();
					log=logUtil.createLog();
				 extent=new ExtentReport();
			}
		

	public void textContain(String string) {
		helper.textContains(StoresUi.heading, string);
		
	}

	public void clickOnviewDetails() {
		helper.explicitWaitOfvisibilityOfElementLocated(StoresUi.viewDetails, 50);
		helper.click(StoresUi.viewDetails);
		
	}

	


	public void clickOnStores() {
		//helper.explicitWaitOfvisibilityOfElementLocated(StoresUi.viewDetails, 50);
		helper.click(StoresUi.store);
		
	}


	public void clickOnLocation() {
		helper.explicitWaitOfvisibilityOfElementLocated(StoresUi.click, 50);
		helper.click(StoresUi.click);
		
	}


	public void clickOnLocation1() {
		helper.explicitWaitOfvisibilityOfElementLocated(StoresUi.viewDetails, 50);
		helper.click(StoresUi.click);
		
	}


	


	public void getTitle(String string) {
		
		helper.getTitle(string);
		
	}

}
