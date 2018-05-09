import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSerch1 {

	public static void main(String[] args)
	{   
		
		goToPage("3");
		}
		public static void goToPage(String PageNumber)
		{
			int requiredPageIndex=0;

	        System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
	    	
	    	WebDriver driver=new ChromeDriver();
	    	driver.navigate().to("https://search.yahoo.com/");
	    	driver.findElement(By.id("yschsp")).sendKeys("selenium",Keys.ENTER);
	    	WebElement ParentElement= driver.findElement(By.xpath("//div[@class='compPagination']"));
	    	List<WebElement> TotalRows=ParentElement.findElements(By.tagName("a"));
	    	System.out.println(TotalRows.size());
	    	{
	    		for(int i=1;i<TotalRows.size();i++)
	    		{
	    			if(TotalRows.get(i).getText().equals("PageNumber"));
	    			{
	    				requiredPageIndex=i;
	    				break;
	    			}
	    		}
	    		TotalRows.get(requiredPageIndex).click();
	    	}


	}

}
