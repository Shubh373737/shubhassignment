package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Redirectionlink {
	private WebDriver driver;

	public Redirectionlink(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void Redirectionlinktab() throws InterruptedException
		{
	
			  driver.findElement(By.xpath("//a[normalize-space()='Redirect Link']")).click();
			  Thread.sleep(2000); 
			  driver.findElement(By.xpath("//a[@id='redirect']")).click();
			  Thread.sleep(2000); 
			  driver.findElement(By.xpath("//a[normalize-space()='200']")).click();
			  Thread.sleep(2000); 
			  driver.findElement(By.xpath("//a[normalize-space()='here']")).click();
			  Thread.sleep(2000); 
			  driver.findElement(By.xpath("//a[normalize-space()='200']")).click();
			  Thread.sleep(2000); 
			  driver.navigate().back();
			  driver.navigate().back();
			  driver.navigate().back();
			  driver.navigate().back();
			  driver.navigate().back();
		
		
		}
}