package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.Formauthentication;
public class Formauthenticationtestcase extends browserlaunch{
	@Test
	public void Formauthentication() throws InterruptedException
	{
		Formauthentication lg = new Formauthentication(driver);
		lg.Formauthenticationtab();
	}

}
