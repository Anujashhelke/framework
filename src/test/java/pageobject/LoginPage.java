package pageobject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import reusable.WebDriverHelper;
import uistore.LoginUi;
import utility.ExtentReport;
import utility.Logs;

public class LoginPage {

	
		public static WebDriverHelper helper;
		public static WebDriver driver;
		Logs logUtil;
		Logger log;
		
			public ExtentReport extent;
		
			public LoginPage(WebDriver driver) {
				 helper=new WebDriverHelper();
				 this.driver=driver;
				 logUtil=new Logs();
					log=logUtil.createLog();
				 extent=new ExtentReport();
				 
				 
			}

			public void hover() {
				helper.action(LoginUi.hover);
				
			}

			public void login() {
				helper.click(LoginUi.login);
				
				
			}

			public void enterEmail(String string) {
				helper.sentText(LoginUi.email, string);
				
			}

			public void enterPass(String string) {
				helper.explicitWaitOfvisibilityOfElementLocated(LoginUi.pass,50);
				helper.sentText(LoginUi.pass,string);
				
			}

			public void submit() {
				helper.explicitWaitOfvisibilityOfElementLocated(LoginUi.submit, 50);
				helper.click(LoginUi.submit);
			}

			public void errorGet() {
				helper.getText(LoginUi.error);
				
			}

			public void requiredField() {
				helper.ErrorMassage(LoginUi.requiredField);
				
			}
	}


