package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
public class Addremoveelement {
	private WebDriver driver;

	public Addremoveelement(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void Addremoveelementtab() throws InterruptedException
		{
			driver.findElement(By.xpath("//a[normalize-space()='Add/Remove Elements']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//button[@class='added-manually']")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//button[@class='added-manually']")).click();
			 Thread.sleep(3000);
			 driver.navigate().back();
}
}
