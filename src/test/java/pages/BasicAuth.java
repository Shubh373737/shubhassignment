package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class BasicAuth {
	private WebDriver driver;

	public BasicAuth(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void BasicAuthtab() throws InterruptedException
		{
			  driver.findElement(By.xpath("//a[normalize-space()='Basic Auth']")).click();
			  Thread.sleep(2000); 
			  driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
			  Thread.sleep(2000); 
			  driver.navigate().back();
			  driver.navigate().back();
}
}