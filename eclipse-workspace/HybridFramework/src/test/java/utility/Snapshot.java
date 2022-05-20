package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Snapshot {
	public String takeSnapshot(WebDriver driver) throws IOException {
		TakesScreenshot sshot=(TakesScreenshot)driver;
		String date=new SimpleDateFormat("MM-dd-yyyy").format(new Date()) ;
		File src=sshot.getScreenshotAs(OutputType.FILE);
		String timeStamp=System.getProperty("user.dir")+"./snapshot/snapshot"+date+".png";
		File dest=new File(timeStamp);
		FileUtils.copyFile(src,dest);
		return timeStamp;
		
		
}
		

}
