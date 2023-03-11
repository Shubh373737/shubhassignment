package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Entryad {
	private WebDriver driver;

	public Entryad(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void Entryadtab() throws InterruptedException
		{
			  driver.findElement(By.xpath("//a[normalize-space()='Entry Ad']")).click();
			  driver.findElement(By.xpath("//a[@id='restart-ad']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//p[normalize-space()='Close']")).click();
			  Thread.sleep(2000); 
			  driver.navigate().back();
		}
}