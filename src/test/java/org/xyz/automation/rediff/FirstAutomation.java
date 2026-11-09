package org.xyz.automation.rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FirstAutomation {
	WebDriver driver;

	@BeforeMethod
	public void launch_browser() {
		// ChromeOptions abc = new ChromeOptions();
		// abc.addArguments("Incognito");

		// WebDriver driver = new ChromeDriver(); //launch chrome browser

		driver = new EdgeDriver(); // launch Edge browser

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // pass the url
		
		//login page should get open
		
		Assert.assertEquals(driver.getTitle(), "Rediffmail - Free Email for Login with Secure Access");
		
		//System.out.println(driver.getTitle());

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@AfterMethod
	public void closebrowser() {
		// driver.close();
		//driver.quit();
	}
	
	

	@Test
	public void register_functionality() {

		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();

		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("John Seo");
		
		
		
		

		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("johnseo12344");
		
		Select dob_month = new Select(driver.findElement(By.xpath("//select[contains (@name,'DOB_Month')]")));
		
		dob_month.selectByIndex(4); //April
		dob_month.selectByValue("06"); //June
		dob_month.selectByVisibleText("SEP"); //September
		dob_month.selectByContainsVisibleText("OC");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
				
				
						
				Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		
		
		
					
		driver.findElement(By.cssSelector("[type='checkbox']")).click();  //checkbox
		
		WebElement hintquestions = driver.findElement(By.xpath("//select[contains(@name, 'hintq')]"));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait .until(ExpectedConditions.textToBePresentInElement(hintquestions, "Select from the list"));
		
				
		
		Select hintq = new Select(hintquestions);
		
		hintq.selectByVisibleText("What is your favourite food?");
		
		//wait.until(ExpectedConditions.alertIsPresent());
		
		//driver.switchTo().alert().accept();
		
		

	}

	
	public void login_functionality() {
		
		//driver.findElement(By.xpath("//label[text()='Rediffmail ID :']")).getText();
		
		//I want to check whether the email address field is there or not
		
		Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Rediffmail ID :']")).getText(), "Rediffmail ID :");

		WebElement username_textbox = driver.findElement(By.id("login1"));

		username_textbox.sendKeys("testuser");

		username_textbox.clear(); // this is used for clearing the text box

		username_textbox.sendKeys("xyz");

		driver.findElement(By.name("passwd")).sendKeys("Pass23455");
		
		//check whether checkbox is checked or not"
		
		System.out.println(driver.findElement(By.cssSelector("[type='checkbox']")).isSelected());  //true
		

		driver.findElement(By.cssSelector("[type='checkbox']")).click(); // checkbox gets unchecked
		
		System.out.println(driver.findElement(By.cssSelector("[type='checkbox']")).isSelected());  //false
		
		//I want to check whether login button is clickable or not
		
		//driver.findElement(By.xpath("//button[text()='Log In']")).isEnabled();
		
		Assert.assertEquals(driver.findElement(By.xpath("//button[text()='Log In']")).isEnabled(), true);
		
		Assert.assertEquals(driver.findElement(By.xpath("//button[text()='Log In']")).isDisplayed(), true);

		// driver.findElement(By.xpath("//button[text()='Log In')).click();

	}

}
