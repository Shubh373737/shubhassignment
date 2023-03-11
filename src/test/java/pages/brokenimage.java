package pages;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
public class brokenimage {
	private WebDriver driver;

	public brokenimage(WebDriver driver)
		{
			this.driver=driver;	
			loadElements();
		}	
		public void loadElements()
		{
			PageFactory.initElements(driver, this);
		}
	  
		public void brokenimagetab() throws InterruptedException, IOException 
		{ 
			  driver.findElement(By.xpath("//a[normalize-space()='Broken Images']")).click();  
		      Thread.sleep(2000);     
		      List<WebElement> images = driver.findElements(By.tagName("img"));
		      System.out.println(images.size());
		    for (WebElement image : images ) {
			String imageSrc = image.getAttribute("src");
			try {
				URL url=new URL (imageSrc);
				URLConnection urlConnection =url.openConnection();
				HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
				httpURLConnection.setConnectTimeout(5000);
				httpURLConnection.connect();
	if(httpURLConnection.getResponseCode()== 200)
				System.out.println(imageSrc + ">>" + httpURLConnection.getResponseCode()+">>");
	else
				System.err.println(imageSrc + ">>" + httpURLConnection.getResponseCode()+">>");
	httpURLConnection.disconnect();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println(imageSrc);
			} 
			
			}
			
		 }
	}
