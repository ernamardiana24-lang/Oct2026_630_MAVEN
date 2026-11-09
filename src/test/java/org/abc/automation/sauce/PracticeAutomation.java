package org.abc.automation.sauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAutomation 
{
	
	@Test
	public void login_functionality()
	{
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("Incognito");
		
		
		WebDriver driver = new ChromeDriver(op); //launch chrome browser
		
		//WebDriver driver = new EdgeDriver(); //launch Edge browser
		
		driver.get("https://www.saucedemo.com/"); //pass the url
		
		driver.manage().window().maximize();
		
		//check whether you see the username textbox or not:
		
		//driver.findElement(By.id("user-name")).getAttribute("placeholder");
		
		Assert.assertEquals(driver.findElement(By.id("user-name")).getAttribute("placeholder"), "username");
		
		
		WebElement username_textbox = driver.findElement(By.id("user-name"));
		username_textbox.sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();  //checkbox gets unchecked
		
		//driver.findElement(By.xpath("//button[text()='Log In']")). click();
		
						
		//driver.close();
		
	}

}
