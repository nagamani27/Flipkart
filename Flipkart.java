import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args)
	{
	  select("Electronics","Mobiles");
	}
    public static void select(String select1,String select2)
    {
    	String Txt1,Txt2;
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	driver.navigate().to("https://www.flipkart.com/");
    	WebElement Electronics1=driver.findElement(By.xpath("//span [(text()='Electronics')]"));
    	Txt1=Electronics1.getText();
    	System.out.println(Txt1);
    	if(Txt1.equals(select1))
    	{
    	Actions as=new Actions(driver);
    	as.moveToElement(Electronics1).build().perform();
    	}
    	WebElement Mobiles=driver.findElement(By.xpath("//span [(text()='Mobiles')]"));
        Txt2=Mobiles.getText();
        System.out.println(Txt2);
    	if(Txt2.equals(select2))
    	{
    		driver.findElement(By.xpath("//span [(text()='Mobiles')]")).click();
    	}
    	
    	
	 
    }
}
