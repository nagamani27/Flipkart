import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//a[@href='/sitemap?otracker=undefined_footer_navlinks']"));
	// JavascriptExecutor js=(JavascriptExecutor)driver;
	 //js.executeScript("arguments[0].scrollIntoView(true);", link);
     Thread.sleep(5000);	
      driver.findElement(By.xpath("//a[@href='/sitemap?otracker=undefined_footer_navlinks']")).click();
     
     	
	}
}
