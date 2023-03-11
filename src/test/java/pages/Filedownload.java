package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Filedownload {
	private WebDriver driver;

	public Filedownload(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void Filedownloadtab() throws InterruptedException
		{
			 driver.findElement(By.xpath("//a[normalize-space()='File Download']")).click();
			 driver.findElement(By.xpath("//a[normalize-space()='LambdaTest.txt']")).click();
			 Thread.sleep(2000); 
			 driver.navigate().back();
		}
}
