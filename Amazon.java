import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		 select("Echo & Alexa","Echo Dot");
	}
		    public static void select(String Header,String SubHeader) throws InterruptedException
		    {
		    	int requiredIndex=0;
		    	int requiredLine=0;
		   
		    	System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
		    	
		    	WebDriver driver=new ChromeDriver();
		    	driver.navigate().to("https://www.amazon.in/");
		    	driver.findElement(By.xpath("//div[@id='nav-shop']")).click();
		    	
		    	List<WebElement> ParentElement= driver.findElements(By.xpath("//table[@id='shopAllLinks']//td//h2"));
		    	System.out.println(ParentElement.size());
		    
		    	for(int i=0;i<ParentElement.size();i++)
		    	{
		    		System.out.println(ParentElement.get(i).getText());
		    		if(ParentElement.get(i).getText().equals(Header))
		    		{
		    			requiredLine=i;
		    			break;
		    		}
		    	}
		    	Thread.sleep(5000);
		    	ParentElement.get(requiredLine).click();
		    	
		    	
		    	List <WebElement> HeadElement=driver.findElements(By.xpath("//table[@id='shopAllLinks']//tbody//tr//td//div//ul//li"));
		        List<WebElement> SubElement=HeadElement.get(requiredLine).findElements(By.tagName("a"));
		        for(int i=0;i<SubElement.size();i++)
		        {
		        	if(SubElement.get(i).getText().equals(SubHeader))
		        	{
		        		requiredIndex=i;
		        		break;
		        	}
		        
		        }
		    	
		        SubElement.get(requiredIndex).click();
		   	
		    	
		    }
		
}
