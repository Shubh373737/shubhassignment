package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.Dynamicloading;
public class Dynamicloadingtestcase extends browserlaunch{
	@Test
	public void Dynamicloading() throws InterruptedException
	{
		Dynamicloading lg = new Dynamicloading(driver);
		lg.Dynamicloadingtab();
	}

}
