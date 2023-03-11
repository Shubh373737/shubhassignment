package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.uploadfile;
public class uploadfiletestcase extends browserlaunch{
	@Test
	public void uploadfile() throws InterruptedException
	{
		uploadfile lg = new uploadfile(driver);
		lg.uploadfiletab();
	}

}
