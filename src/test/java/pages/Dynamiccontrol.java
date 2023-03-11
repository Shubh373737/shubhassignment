package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Dynamiccontrol {
	private WebDriver driver;

	public Dynamiccontrol(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void Dynamiccontroltab() throws InterruptedException
		{
			  driver.findElement(By.xpath("//a[normalize-space()='Dynamic Controls']")).click();
			  Thread.sleep(2000); 
			  driver.findElement(By.xpath("//button[normalize-space()='Remove']")).click();
			  Thread.sleep(4000); 
			  driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
			  Thread.sleep(4000); 
			  driver.findElement(By.xpath("//button[normalize-space()='Enable']")).click();
			  Thread.sleep(3000); 
			  driver.findElement(By.xpath("//button[normalize-space()='Disable']")).click();
			  Thread.sleep(2000);
			  driver.navigate().back();
			  
		
		}
}