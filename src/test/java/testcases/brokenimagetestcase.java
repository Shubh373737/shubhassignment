package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Baseclass.browserlaunch;
import pages.uploadfile;
import pages.brokenimage;


public class brokenimagetestcase extends browserlaunch{
	@Test
	public void brokenimage() throws InterruptedException, IOException
	{
		brokenimage lg = new brokenimage(driver);
		lg.brokenimagetab();
	}

}

