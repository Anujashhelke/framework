package pageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import reusable.WebDriverHelper;
import uistore.GiftCollectionUi;
import utility.ExtentReport;
import utility.Logs;

public class GiftCollectionPageObject {
	public static WebDriverHelper helper;
	public static WebDriver driver;
	Logs logUtil;
	 Logger log;
		
		public ExtentReport extent;

	public GiftCollectionPageObject(WebDriver driver) {
		 helper=new WebDriverHelper();
		 this.driver=driver;
		 logUtil=new Logs();
			log=logUtil.createLog();
		 extent=new ExtentReport();
		
	}

	public void clickOnGift() {
		helper.click(GiftCollectionUi.gift);
		log.info("clicked successfully");
	}

	public void hover() {
		helper.action(GiftCollectionUi.hover);
		log.info("hovered successfully");
		
	}

	public void clickOnChoose() {
		helper.click(GiftCollectionUi.button);
		log.info("choosed successfully");
		
	}

	public void insertAccount() {
		helper.sentText(GiftCollectionUi.account,"1200");
		
	}

	public void getText() {
	helper.getText(GiftCollectionUi.text);
		
	}

	public void insertDate() {
		helper.select2(GiftCollectionUi.month);
	}

	public void clickNext() {
		helper.click(GiftCollectionUi.next);
		
	}

	public void sendText(String string, String string2, String string3, String string4, String string5) {
		helper.sentText(GiftCollectionUi.receipntName, string);
		helper.sentText(GiftCollectionUi.customerName, string2);
		helper.sentText(GiftCollectionUi.receiprntmail, string3);
		helper.sentText(GiftCollectionUi.customerMail, string4);
		helper.sentText(GiftCollectionUi.phone, string5);
		
		
		
		
	}

	public void clickConfirm() {
		helper.clickExecuter(GiftCollectionUi.next);
		log.info("clicked");
		
	}

}
