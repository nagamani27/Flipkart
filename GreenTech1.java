import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreenTech1 {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\Sai5\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the course  ");
	    String s1=s.nextLine();
	    Actions a=new Actions(driver);
	    WebElement move=driver.findElement(By.xpath("//a[contains(text(),'COURSES')]"));
	    a.moveToElement(move).build().perform();
	    
	    
	}

}
