package testcases;
import org.testng.annotations.Test;
import Baseclass.browserlaunch;
import pages.HorizontalSlider;
public class HorizontalSlidertestcase extends browserlaunch{
	@Test
	public void HorizontalSlider() throws InterruptedException
	{
		HorizontalSlider lg = new HorizontalSlider(driver);
		lg.HorizontalSlidertab();
	}

}