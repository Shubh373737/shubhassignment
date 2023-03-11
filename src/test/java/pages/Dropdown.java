package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {
private WebDriver driver;

public Dropdown(WebDriver driver)
	{
		this.driver=driver;	
		loadElements();
	}	
	public void loadElements()
	{
		PageFactory.initElements(driver, this);
	}
	public void dropdowntab() throws InterruptedException
	{
		  driver.findElement(By.xpath("//a[normalize-space()='Dropdown']")).click();
		  Thread.sleep(2000); 
		  driver.findElement(By.xpath("//select[@id='dropdown']"));
			WebElement dropdown = driver . findElement(By.id("dropdown"));
			Select select =new Select(dropdown);
			select.selectByVisibleText("Option 2");
			Thread.sleep(2000); 
			driver.navigate().back();
	}
}
