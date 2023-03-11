package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Securefiledownload {
	private WebDriver driver;

	public Securefiledownload(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void Securefiledownloadtab() throws InterruptedException
		{
	
			  driver.findElement(By.xpath("//a[normalize-space()='Secure File Download']")).click();
			  Thread.sleep(2000); 
			  driver.get("http://admin:admin@the-internet.herokuapp.com/download_secure");
			  Thread.sleep(2000); 
			  driver.findElement(By.xpath("//a[normalize-space()='example.json']")).click();
			  Thread.sleep(2000);
			  driver.navigate().back();
			  driver.navigate().back();
		}
}