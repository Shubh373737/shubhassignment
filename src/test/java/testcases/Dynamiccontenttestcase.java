package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.Checkboxes;
import pages.Dynamiccontent;

public class Dynamiccontenttestcase extends browserlaunch{
	@Test
	public void Dynamiccontent() throws InterruptedException
	{
		Dynamiccontent lg = new Dynamiccontent(driver);
		lg.Dynamiccontenttab();
	}

}
