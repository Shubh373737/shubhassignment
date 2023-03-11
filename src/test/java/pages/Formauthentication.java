package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Formauthentication {
	private WebDriver driver;

	public Formauthentication(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void Formauthenticationtab() throws InterruptedException
		{
			 driver.findElement(By.xpath("//a[normalize-space()='Form Authentication']")).click();
			 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
			 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecret");
			 driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
			 Thread.sleep(2000);
			 driver.navigate().back();
			 driver.navigate().back();
			 
		}
}
