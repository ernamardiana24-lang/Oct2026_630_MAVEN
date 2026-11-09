package org.xyz.automation.rediff;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;



public class HandleKBMouseWindows
{

	WebDriver driver;
	
	@Test
	public void handleFrames() throws Exception	
{
	driver = new EdgeDriver();
	
	driver.get("https://demoqa.com/frames");
	
	driver.manage().window().maximize();
	
	System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
	
	driver.switchTo().frame("frame1");
	
	System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
	
	driver.switchTo().defaultContent();
	
	System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
	
	CaptureScreenshot.testresults(driver, "handleFrames");
	
	
	
}
	
	@Test
		public void handleAlerts() throws Exception	
	{
		driver = new EdgeDriver();
		
		driver.get("https://mail.Rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.testresults(driver, "handleAlerts");
	}	
	
		
	public void handleMouse() throws Exception	
	{
		driver = new EdgeDriver();
		
		driver.get("https://www.Rediff.com/");
		
		driver.manage().window().maximize();
		
				
		Actions act = new Actions(driver);	
		
			
		act.moveToElement(driver.findElement(By.xpath("//button[text()='Payments']"))).perform();
		
		act.click(driver.findElement(By.xpath("//a[text()='Mobile Recharge']"))).perform();
		
		Thread.sleep(5000);
		
		Set<String> windowsid = driver.getWindowHandles();


		Iterator<String> itr = windowsid.iterator();
		
		String win1 = itr.next();
		
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		
		driver.findElement(By.cssSelector("[type='tel']")).sendKeys("7799601918");
		
		
		
		
		//act.scrollToElement(driver.findElement(By.xpath("//a[text()='About Rediff']"))).perform();
		
		//act.dragAndDrop(source, target);
		
		
	
	}
		
		
	
	
	
	
	public void handleKeyboard()
	{
		driver = new EdgeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("login1"));
		
		Actions act = new Actions(driver);	
		
		act.click(username).perform();
		
		act.sendKeys("testuser").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("pass2344").perform();
		
		act.sendKeys(Keys.ENTER).perform();
	
	}
	
	
	
	
	
}
