package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectUnselectCheckbox 
{

	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver driver=new ChromeDriver(); // Launch Broswer
		driver.get("https://testautomationpractice.blogspot.com/"); 	// Open website URL
		driver.manage().window().maximize(); // Maximize size of the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		//capturing all the check boxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//select all
		
		Thread.sleep(5000);
		for (WebElement chkbox:checkboxes)
		{
			if (chkbox.isSelected())
			{
				chkbox.click();
			}
			else 
			{
				chkbox.click();
			}
		}
		
		//Unselect all
		
		Thread.sleep(5000);
		for (WebElement chkbox:checkboxes)
		{
			if (chkbox.isSelected())
			{
				chkbox.click();
			}
			else 
			{
				chkbox.click();
			}
		}
	}

}
