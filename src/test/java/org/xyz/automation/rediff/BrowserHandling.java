package org.xyz.automation.rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserHandling 
{
	
	@Test
	public void login_functionality() throws Exception
	{
		
			
		WebDriver driver = new EdgeDriver(); //launch chrome browser
				
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //pass the url
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.manage();timeouts().pageLoadTimeout(dutation.ofSeconds(300));
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")). click();
		
		driver.navigate().back();
		
		Thread.sleep(5000); // wait for 5 second

		driver.navigate().forward();
		
		Thread.sleep(5000); // wait for 5 second
		
		driver.navigate().refresh();
		
		//driver.close(); // will close one window at a time
		
		driver.quit(); // will close all the window
		
		
		
		
		
		
	}

}
