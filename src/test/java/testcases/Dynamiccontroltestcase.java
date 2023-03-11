package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.Dynamiccontrol;
public class Dynamiccontroltestcase extends browserlaunch{
	@Test
	public void Dynamiccontrol() throws InterruptedException
	{
		Dynamiccontrol lg = new Dynamiccontrol(driver);
		lg.Dynamiccontroltab();
	}

}
