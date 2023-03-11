package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Notificationmessage {
	private WebDriver driver;

	public Notificationmessage(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void Notificationmessagetab() throws InterruptedException
		{
	
			  driver.findElement(By.xpath("//a[normalize-space()='Notification Messages']")).click();
			  Thread.sleep(2000); 
			  driver.findElement(By.xpath("//a[normalize-space()='Click here']")).click();
			  Thread.sleep(2000); 
			  driver.navigate().back();
			  driver.navigate().back();
			 
		}
}