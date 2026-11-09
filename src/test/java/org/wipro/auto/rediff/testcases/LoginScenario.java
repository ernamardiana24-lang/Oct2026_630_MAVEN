package org.wipro.auto.rediff.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.rediff.base_layer.InitiateBrowser;
import org.wipro.auto.rediff.pages.LoginPage;
import org.wipro.auto.rediff.pages.LoginPage_PF;
import org.wipro.auto.rediff.utilities_layer.ReadPropertiesFiles;

public class LoginScenario extends InitiateBrowser
{
	//global driver

	@Test
	public void tc01_validate_login_functionality_valid_credentials() throws Exception
	{
		
		LoginPage_PF login = new LoginPage_PF(driver);
		
		//local driver
		
		login.enter_username_textbox("testuser");
		login.enter_password_textbox("testpass");
		login.check_rememberme_checkbox();
		login.click_login_button();
		
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
		
	}
	
	@Test
	public void tc02_validate_login_functionality_valid_credentials() throws Exception
	{
		
		LoginPage login = new LoginPage(driver);
		
		//local driver
		
		login.enter_username_textbox(ReadPropertiesFiles.read_config_prop_file("username"));
		login.enter_password_textbox(ReadPropertiesFiles.read_config_prop_file("password"));
		login.check_rememberme_checkbox();
		login.click_login_button();
		
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
		
	}
}
