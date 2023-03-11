package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class DigestAuthentication {
	private WebDriver driver;

	public DigestAuthentication(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
		public void DigestAuthenticationtab() throws InterruptedException
		{
	
			  driver.findElement(By.xpath("//a[normalize-space()='Digest Authentication']")).click();
			  Thread.sleep(2000); 
			  driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
			  Thread.sleep(2000); 
			  driver.navigate().back();
			  driver.navigate().back();
		}			  
}
