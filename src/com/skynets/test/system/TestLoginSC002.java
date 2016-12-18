package com.skynets.test.system;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skynets.config.DriverFactory;
import com.skynets.ui.LoginPage;
import com.skynets.utils.GetData;

public class TestLoginSC002
{
   WebDriver driver=DriverFactory.getDriverInstance();
   LoginPage login=new LoginPage(driver);
   String un=GetData.fromExcel("tdata1","SC002",1,0);
   String pwd=GetData.fromExcel("tdata1","SC002", 1, 1);
   @Test
   public void testLoginTC005()
   {
	   login.getUserTextBox().sendKeys(un);
	   login.getPasswordTextBox().sendKeys(pwd);
	   login.getLoginButton().click();
	   
	   //verify Error message
	   String actual=login.getErrorMessage().getText();
	   String expected="Username or Password is invalid.Please try again.";
	   Assert.assertEquals(actual, expected);
	   //verify it lands on Login screen
	   String actualText=login.getHeaderElement().getText();
	   String expectedText="please identify yourself";
	   Assert.assertEquals(actualText,expectedText);
	   
	   
   }
   @AfterMethod
   public void postCondition()
   {
	   driver.close();
   }
   
   
}
