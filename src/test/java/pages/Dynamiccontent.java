package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class Dynamiccontent {
	private WebDriver driver;

	public Dynamiccontent(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void Dynamiccontenttab() throws InterruptedException
		{
			driver.findElement(By.xpath("//a[normalize-space()='Dynamic Content']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[normalize-space()='click here']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[normalize-space()='click here']")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			driver.navigate().back();
}
}
