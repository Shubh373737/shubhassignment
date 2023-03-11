package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;

import pages.uploadfile;
import pages.Dropdown;
public class Dropdowntestcase extends browserlaunch{
	@Test
	public void Dropdown() throws InterruptedException
	{
		Dropdown lg = new Dropdown(driver);
		lg.dropdowntab();
	}

}
