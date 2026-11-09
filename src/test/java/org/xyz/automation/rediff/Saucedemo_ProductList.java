package org.xyz.automation.rediff;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Saucedemo_ProductList 
{
	@Test
	public void product_page() 
	{
		//Launch Edge browser
		WebDriver driver = new EdgeDriver();

		// Open the login page
		//Action: Open the login page
		driver.get("https://www.saucedemo.com/");
		
		//Validate that the page is open successfully
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");

		// Maximize browser
		driver.manage().window().maximize();

		// Enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//login button location coordinate
		
		System.out.println(driver.findElement(By.id("login-button")).getLocation());  //location coordinate
		
		System.out.println(driver.getPageSource());

		// Click Login
		driver.findElement(By.id("login-button")).click();
		
		//login button location coordinate
		
		
		//user logged in successfully and navigate to product page
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
		

		// WebElement product1 = driver.findElement(By.xpath("//div[text()='Sauce Labs  Backpack']"));
		// product1.click();

		List<WebElement> product_list = driver.findElements(By.cssSelector("[class='inventory_item_name ']"));

		System.out.println(product_list.size());

		//System.out.println(product_list.get(1).getText());
		
		for(WebElement i:product_list)
		{
			System.out.println(i.getText());
		}
		
		//product_list.get(1).click();

		// plist = ["webelement1, webelement2"];

		// logical - 0, 1,2, 3
		// Physical - 1, 2,3
		
		
		/*
		Object[] data1 = {"Hema","Erna"}; //data1[0] = Hema
		
		System.out.println(data1[0]);		 		
		Object [] [] data2 = {{"Hema", "NY", 10}, {"Erna", "CA", 10}};
		System.out.println(data2[0][1]);
*/
		// Close browser
		// driver.quit();
	}

}
