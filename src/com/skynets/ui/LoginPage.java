package com.skynets.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getHeaderElement()
	{
		return driver.findElement(By.id("headerContainer"));
		
	}
	public WebElement getUserTextBox()
	{
		WebElement element=null;
		try
		{
			WebElement ele=driver.findElement(By.name("username"));
		}
		catch(Exception e)
		{
			WebElement ele=driver.findElement(By.name("un"));
		}
		return element;
	}
	public WebElement getPasswordTextBox()
	{
		return driver.findElement(By.name("pwd"));
	}
	public WebElement getKeepMeLoggedInCheckbox()
	{
		return driver.findElement(By.id("keep me logged i checkbox"));
		
	}
   public WebElement getLoginButton()
   {
	   return driver.findElement(By.id("loginBButton"));
   }
   public WebElement getErrorMessage()
   {
	   return driver.findElement(By.xpath("//span[contains(text(),'Username or Password is invalid')]"));
   }
}
