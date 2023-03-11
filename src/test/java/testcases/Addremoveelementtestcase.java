package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.Addremoveelement;
public class Addremoveelementtestcase extends browserlaunch{
	@Test
	public void Addremoveelement() throws InterruptedException
	{
		Addremoveelement lg = new Addremoveelement(driver);
		lg.Addremoveelementtab();
	}

}
