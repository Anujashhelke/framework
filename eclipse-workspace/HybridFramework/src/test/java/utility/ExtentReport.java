package utility;


	import java.text.SimpleDateFormat;
	import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Test;




	public class ExtentReport {
		public ExtentReports extent;
		ExtentTest test;
		public String timeStamp;
		
		@BeforeTest
		public void createReport() {
			timeStamp="./reports";
			Date d=new Date();
			String date=new SimpleDateFormat("MM-dd-yy-HH-mm-ss").format(d);
			extent=new ExtentReports(System.getProperty("user.dir")+"./reports/rp"+date+".html",true);
			//return extent;
			
		}
		
		public void createTest(String Testname) {
			test=extent.startTest(Testname);
			test.assignAuthor("anuja shelke");
			//return test;
		
		}
		public void logPass(String text) {
			test.log(LogStatus.PASS,text);
			test.log(LogStatus.PASS,test.addBase64ScreenShot(text));
		}
		public void logFail(String text) {
			test.log(LogStatus.FAIL, text);
			
		}
	@AfterTest
		public void endReport() {
		
			extent.endTest(test);	
			extent.flush();
			
		}
	  
		public void closeReport() {
			
			extent.close();	
			
		}

	}

