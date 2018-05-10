import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {

	public static void main(String[] args) 
	{
		 select("Electronics","Mobiles");
	}
		    public static void select(String select1,String select2)
		    {
		    	String requiredText=null,Txt1;
		    	int requiredIndrx=0;
		    	System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
		    	
		    	WebDriver driver=new ChromeDriver();
		    	driver.navigate().to("https://www.flipkart.com/");
		    	WebElement ParentElement= driver.findElement(By.xpath("//div[@class='_3Ed3Ub']/ul/li/a"));
		    	List<WebElement> TotalRows=ParentElement.findElements(By.tagName("span"));
		    	System.out.println(TotalRows.size());
		    	System.out.println(TotalRows.size());
		    	{
		    		for(int i=0;i<TotalRows.size();i++)
		    		{
		    			if(TotalRows.get(i).getText().equals(select1));
		    			{
		    	
		    				if(requiredText.equals(select1))
		    				{
		    				requiredIndrx=i;
		    				}
		    				break;
		    			}
		    		}
		    		TotalRows.get(requiredIndrx).click();
		    		
		    			    		
		    		//Actions as=new Actions(driver);
		        	//as.moveToElement(driver.findElement(By.xpath("//div[@class='_3Ed3Ub']/ul/li/a/span"))).build().perform();
		    		switch(requiredIndrx) {
		            case 0:
		            			                break;
		            case 1:
		            	
		                break;
		            case 2:
		            	
		                break;
		            case 3:
		            	
		                break;
		                
		            default:
		            	driver.findElement(By.xpath("//a[@title='Results 1-10']")).click();
		        }
		        	
		    	}

		    	
		    	
		    	
		    }
		    
}	    