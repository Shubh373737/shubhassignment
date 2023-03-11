package Baseclass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
public class browserlaunch {
	public static WebDriver driver;
	
	  @BeforeSuite

	public void base() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");	

  driver=new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.manage().window().maximize();

	 
}
}