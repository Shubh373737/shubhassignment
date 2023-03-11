package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.Securefiledownload;

public class Securefiledownloadtestcase extends browserlaunch{
	@Test
	public void Securefiledownload() throws InterruptedException
	{
		Securefiledownload lg = new Securefiledownload(driver);
		lg.Securefiledownloadtab();
	}

}

