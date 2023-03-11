package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.BasicAuth;

public class BasicAuthtestcase extends browserlaunch{
	@Test
	public void BasicAuth() throws InterruptedException
	{
		BasicAuth lg = new BasicAuth(driver);
		lg.BasicAuthtab();
	}

}

