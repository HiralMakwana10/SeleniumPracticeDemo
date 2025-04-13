package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxUsingSwitchCase 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String weekname = "Monday";
		
		switch (weekname)
		{
		
		case "Sunday" : driver.findElement(By.xpath("//input[@id='sunday']")).click();
			break;
		
		case "Monday" : driver.findElement(By.xpath("//input[@id='monday']")).click();
			break;
			
		case "Tuesday" : driver.findElement(By.xpath("//input[@id='tuesday']")).click();
			break;
			
		case "Wednesday" : driver.findElement(By.xpath("//input[@id='wednesday']")).click();
			break;
			
		case "Thursday" : driver.findElement(By.xpath("//input[@id='thursday']")).click();
			break;
			
		case "Friday" : driver.findElement(By.xpath("//input[@id='friday']")).click();
			break;
			
		case "Saturday" : driver.findElement(By.xpath("//input[@id='saturday']")).click();
			break;
			
		default : System.out.println ("Invalid");
		
		}
	}
	

}
