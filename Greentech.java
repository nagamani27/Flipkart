import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greentech {

	public static void main(String[] args) throws Throwable
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.greenstechnologys.com/");
			WebElement clk=driver.findElement(By.xpath("//a[contains(text(),'Certifications')]"));
			clk.click();
			
			List<WebElement> clk1=driver.findElements(By.xpath("//a[contains(text(),'Course Content')]"));
			
			for(WebElement a:clk1)
			{
				a.click();
				WebElement gtext=driver.findElement(By.cssSelector("p"));
				System.out.println(gtext.getText());
				
			}
		
			
		//driver.quit();
		

	}

}
