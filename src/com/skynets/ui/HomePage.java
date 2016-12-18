package com.skynets.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage
{
  WebDriver driver;
  public HomePage(WebDriver driver)
  {
	  this.driver=driver;
  }
  public WebElement getTimeTrackTab()
  {
	  return driver.findElement(By.xpath("//div[contains(text(),'Time-Track')]"));
  }
  public WebElement getTaskTab()
  {
	  return driver.findElement(By.xpath("//div[contains(text(),'Tasks')]"));
  }
  public WebElement getUserTab()
  {
	  return driver.findElement(By.xpath("//div[contains(text(),'Users')]"));
  }
  public WebElement getSetingsTab()
  {
	  return driver.findElement(By.xpath("//div[contains(text(),'Settings')]"));
  }
  public WebElement getLogoutLink()
  {
	  return driver.findElement(By.id("logoutLink"));
  }
 
  
}