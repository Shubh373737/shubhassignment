package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class uploadfile {
	private WebDriver driver;

	public uploadfile(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void uploadfiletab() throws InterruptedException
		{
			driver.findElement(By.xpath("//a[normalize-space()='File Upload']")).click();
			 Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\\\Users\\\\Admin\\\\Desktop\\\\Testing documents\\\\7d3c95b6b0e5952f6ad36551bf9658ca.png");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='file-submit']")).click();
			 driver.navigate().back();
		
		}
}