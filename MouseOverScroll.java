import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverScroll {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.greenstechnologys.com/");
			
		    Actions a=new Actions(driver);
		    WebElement move=driver.findElement(By.xpath("//a[contains(text(),'COURSES')]"));
		    a.moveToElement(move).build().perform();
		    
		    WebElement move1=driver.findElement(By.xpath("//span[contains(text(),'Oracle Training')]"));
		    a.moveToElement(move1).build().perform();
		    
		    WebElement move3=driver.findElement(By.xpath("//span[contains(text(),'Oracle SQL and PLSQL Training')]"));
		   move3.click();
		   
			  WebElement move4=driver.findElement(By.xpath("//*[contains(text(),'Oracle SQL and PLSQL Training Syllabus')]"));

		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView(true);",move4);
		  
		  
		  //WebElement move4=driver.findElement(By.xpath("//*[contains(text(),'Oracle SQL and PLSQL Training Syllabus')]"));
		   System.out.println(move4.getText()); 
		    //a.contextClick().build().perform();  //right click on that
		    //driver.close();
	}

}
