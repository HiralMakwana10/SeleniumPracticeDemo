package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// 1. Name locator
		/*
		WebElement SearchBox=driver.findElement(By.name("field-keywords"));
		SearchBox.sendKeys("ps5");
		*/
		
		// shortcut way
		driver.findElement(By.name("field-keywords")).sendKeys("ps5");
	}

}
