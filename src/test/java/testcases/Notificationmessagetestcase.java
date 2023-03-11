package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.Notificationmessage;
public class Notificationmessagetestcase extends browserlaunch{
	@Test
	public void DigestAuthentication() throws InterruptedException
	{
		Notificationmessage lg = new Notificationmessage(driver);
		lg.Notificationmessagetab();
	}

}