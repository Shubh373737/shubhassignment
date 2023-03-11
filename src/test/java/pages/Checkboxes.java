package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class Checkboxes {
	private WebDriver driver;

	public Checkboxes(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void Checkboxestab() throws InterruptedException
		{   
			driver.navigate().back();
			driver.findElement(By.xpath("//a[normalize-space()='Checkboxes']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[1]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
}
}
