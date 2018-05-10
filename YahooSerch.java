import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSerch {

	public static void main(String[] args)
	{
	goToPage(2);
	}
	public static void goToPage(int PageNumber)
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	driver.navigate().to("https://search.yahoo.com/");
    	driver.findElement(By.id("yschsp")).sendKeys("selenium",Keys.ENTER);
    	//WebElement ParentElement=driver.findElement("//strong[contains(text(),1)]");
    	//String Locator="//a[@title='Results #-#']";
    	/*if(PageNumber.equals("1"))
		{
    	String NewLocator=Locator.replaceAll("#-#","1-10");
		}
		else if(PageNumber.equals("2"))
    	{
			String NewLocator=Locator.replaceAll("#-#","11-20");
    	}
		else if(PageNumber.equals("3"))
		{
			String NewLocator=Locator.replaceAll("#-#","21-30");
		}*/
    	switch(PageNumber) {
        case 1:
        	driver.findElement(By.xpath("//a[@title='Results 1-10']")).click();
            break;
        case 2:
        	driver.findElement(By.xpath("//a[@title='Results 11-20']")).click();
            break;
        case 3:
        	driver.findElement(By.xpath("//a[@title='Results 21-30']")).click();
            break;
        case 4:
        	driver.findElement(By.xpath("//a[@title='Results 31-40']")).click();
            break;
        case 5:
        	driver.findElement(By.xpath("//a[@title='Results 41-50']")).click();
            break;
            
        default:
        	driver.findElement(By.xpath("//a[@title='Results 1-10']")).click();
    }
    	
    	
	}

}
