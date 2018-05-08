import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GreenTech3 {

	public static void main(String[] args) throws Throwable
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement clk=driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
		clk.click();
		
		WebElement clk1=driver.findElement(By.xpath("//select[@class='iCthae']"));
		clk1.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",clk1);
		WebElement sel=driver.findElement(By.xpath("//option[@value='te']"));
		Select s=new Select(sel);
		
		
		
		
		//System.out.println(select.getText());
		
	}

}
