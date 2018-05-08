import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greentech2 {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.greenstechnologys.com/");
			WebElement clk=driver.findElement(By.xpath("//a[contains(text(),'HOME')]"));
			clk.click();
			WebElement txt=driver.findElement(By.xpath("//h2[contains(text(),'Greens Technologys Overall Reviews')]"));
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",txt);
			String txt1=txt.getText();
			
			if(txt1.equals(txt))
			
				System.out.println(txt1);
			
				
			else
				System.out.println("the text is not there");
	}

}
