package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSingleCheckbox 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//select Single Check box
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']")); // Before Selection
		System.out.println("Before Selection:" +checkbox.isSelected());
		
		driver.findElement(By.xpath("//input[@id='sunday']")).click(); // After Selection
		System.out.println("After Selection:" +checkbox.isSelected());
	}
}
