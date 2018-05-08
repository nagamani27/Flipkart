import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basecls 
{
 public WebDriver pass(String url)
  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get(url);
     return driver;
   }
  public void input(WebElement element,String name)
  {
	  element.sendKeys(name);
  }
 public void clk(WebElement element)
 {
	 element.click();
 }
}
