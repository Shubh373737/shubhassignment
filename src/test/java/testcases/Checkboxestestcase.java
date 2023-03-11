package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.Checkboxes;

public class Checkboxestestcase  extends browserlaunch{
	@Test
	public void Checkboxes() throws InterruptedException
	{
		Checkboxes lg = new Checkboxes(driver);
		lg.Checkboxestab();
	}

}
