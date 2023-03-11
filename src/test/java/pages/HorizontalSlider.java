package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class HorizontalSlider {
	private WebDriver driver;

	public HorizontalSlider(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void HorizontalSlidertab() throws InterruptedException
		{
			 driver.findElement(By.xpath("//a[normalize-space()='Horizontal Slider']")).click();
             WebElement slideBar = driver.findElement(By.xpath("//input[@type='range']"));
             slideBar.sendKeys(Keys.END);
             Thread.sleep(3000); 
             driver.navigate().back();
		}
}