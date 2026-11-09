package org.wipro.auto.rediff.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.auto.rediff.utilities_layer.ReadPropertiesFiles;

public class LoginPage_PF
{

	WebDriver driver;
	
	
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login1")
	WebElement username_textbox;

	@FindBy(name="passwd")
	WebElement password_textbox;
	
	@FindBy(css="[type='checkbox']")
	WebElement rememberme_checkbox;
	
	@FindBy(xpath="//button[text()='Log In']")
	WebElement login_button;
	
	public void enter_username_textbox(String username) throws Exception 
	{
		
		//WebElement username_textbox = driver.findElement(By.id(ReadPropertiesFiles.read_element_prop_file("login_username_id")));
		username_textbox.sendKeys(username);
	}
	
	public void enter_password_textbox(String password) throws Exception 
	{
		//WebElement password_textbox = driver.findElement(By.name(ReadPropertiesFiles.read_element_prop_file("login_password_name")));
		password_textbox.sendKeys(password);
	}
	
	public void click_login_buttton() throws Exception 
	{
		//WebElement rememberme_checkbox = driver.findElement(By.cssSelector(ReadPropertiesFiles.read_element_prop_file("login_checkbox_css")));
		rememberme_checkbox.click();
	}
	
	public void click_login_button() throws Exception 
	{
		//WebElement login_button = driver.findElement(By.xpath(ReadPropertiesFiles.read_element_prop_file("login_button_xpath")));
		login_button.click();
	}

	public void check_rememberme_checkbox() {
		// TODO Auto-generated method stub
		
	}
}  
