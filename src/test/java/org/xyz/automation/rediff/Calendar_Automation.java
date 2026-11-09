package org.xyz.automation.rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Calendar_Automation 
{
	
	@Test
	public void calendar_icon() throws Exception
	{
		
			
		WebDriver driver = new EdgeDriver(); //launch chrome browser
				
		driver.get("https://www.agoda.com/"); //pass the url
		//driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
					
		driver.findElement(By.cssSelector("[data-selenium='checkInText']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("[data-selenium-date='2026-10-19']")). click();
		
		driver.findElement(By.cssSelector("[data-selenium-date='2026-10-21']")). click();
		
		
	}

}
