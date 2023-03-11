package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.Entryad;
public class Entryadtestcase extends browserlaunch{
	@Test
	public void Entryad() throws InterruptedException
	{
		Entryad lg = new Entryad(driver);
		lg.Entryadtab();
	}

}
