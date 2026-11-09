package org.wipro.auto.rediff.base_layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.wipro.auto.rediff.utilities_layer.ReadPropertiesFiles;


public class InitiateBrowser 
{
		public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadPropertiesFiles.read_config_prop_file("BrowserName").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadPropertiesFiles.read_config_prop_file("BrowserName").equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
		}
		
		else if(ReadPropertiesFiles.read_config_prop_file("BrowserName").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else
		{
			driver = new ChromeDriver();
		}

	
		driver.get(ReadPropertiesFiles.read_config_prop_file("ApplicationURL"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(60));
		
	
		
	}

	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
