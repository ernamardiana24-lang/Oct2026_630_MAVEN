package org.wipro.auto.rediff.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.auto.rediff.base_layer.InitiateBrowser;
import org.wipro.auto.rediff.pages.LoginPage;
import org.wipro.auto.rediff.pages.LoginPage_PF;
import org.wipro.auto.rediff.utilities_layer.ReadPropertiesFiles;
import org.wiproauto.rediff.data_layer.DataDriven;

public class LoginScenario_DDT extends InitiateBrowser
{
	//global driver

	@Test(dataProvider="login",dataProviderClass=DataDriven.class)
	public void tc01_validate_login_functionality_valid_credentials(String uname, String pass) throws Exception
	{
		
		LoginPage_PF login = new LoginPage_PF(driver);
		
		//local driver
		
		login.enter_username_textbox("uname");
		login.enter_password_textbox("pass");
		login.check_rememberme_checkbox();
		//login.click_login_button();
		
		
		
	}
	
	
}
