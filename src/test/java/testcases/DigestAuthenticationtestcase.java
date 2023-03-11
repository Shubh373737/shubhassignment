package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.DigestAuthentication;
public class DigestAuthenticationtestcase extends browserlaunch{
	@Test
	public void DigestAuthentication() throws InterruptedException
	{
		DigestAuthentication lg = new DigestAuthentication(driver);
		lg.DigestAuthenticationtab();
	}

}