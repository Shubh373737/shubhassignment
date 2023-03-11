package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.Filedownload;
public class Filedownloadtestcase extends browserlaunch{
	@Test
	public void Filedownloadtestcase() throws InterruptedException
	{
		Filedownload lg = new Filedownload(driver);
		lg.Filedownloadtab();
	}

}