package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.Redirectionlink;
public class Redirectioninktestcase extends browserlaunch{
	@Test
	public void Redirectionlink() throws InterruptedException
	{
		Redirectionlink lg = new Redirectionlink(driver);
		lg.Redirectionlinktab();
	}

}