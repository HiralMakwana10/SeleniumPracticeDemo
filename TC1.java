package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		// Capture title of the web page
		String title = driver.getTitle();
		System.out.println("Title of the page is:" +title);
		
		// Capture URL of the web page
		System.out.println("Url of the page is:" +driver.getCurrentUrl());
		
		//Capture page source 
		System.out.println("Page source is:" +driver.getPageSource());
		
		// Close Browser 
		driver.close();
	}

}
