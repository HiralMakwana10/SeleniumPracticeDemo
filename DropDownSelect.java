package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select drpCountry= new Select (drpCountryEle);
		
		//1. select option from the drop down
		//drpCountry.selectByVisibleText("Canada");
		//drpCountry.selectByIndex(3);
		//drpCountry.selectByValue("japan");
		
		
		//2. capture the options from the drop down
		/*
		List<WebElement> options=drpCountry.getOptions();
		System.out.println(options.size());
		*/
		
		//3. printing the options 
		/*
		List<WebElement> options=drpCountry.getOptions();
		for (int i=0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		*/
		
		// enhance for loop
		
		List<WebElement> options=drpCountry.getOptions();
		for (WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
				
		//driver.close();
		
	}

}
