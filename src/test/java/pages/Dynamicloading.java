package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Dynamicloading {
	private WebDriver driver;

	public Dynamicloading(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void Dynamicloadingtab() throws InterruptedException
		{
			  driver.findElement(By.xpath("//a[normalize-space()='Dynamic Loading']")).click();
			  Thread.sleep(2000); 
			  driver.findElement(By.xpath("//a[normalize-space()='Example 1: Element on page that is hidden']")).click();
			  driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
			  Thread.sleep(6000); 
			  driver.navigate().back();
			  driver.findElement(By.xpath("//a[normalize-space()='Example 2: Element rendered after the fact']")).click();
			  driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
			  Thread.sleep(6000);
			  driver.navigate().back();
			  driver.navigate().back();
		}
}
