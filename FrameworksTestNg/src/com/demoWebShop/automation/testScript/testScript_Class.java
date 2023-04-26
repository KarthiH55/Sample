package com.demoWebShop.automation.testScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.demoWebShop.automation.generic.Base_Class;
import com.demoWebShop.automation.generic.DataProvider1_Class;

public class testScript_Class extends Base_Class
{
  @Test(dataProvider = "Data",dataProviderClass = DataProvider1_Class.class)
public void Register(String fn,String ln,String email,String pwd)
{
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	driver.findElement(By.name("Gender")).click();
	driver.findElement(By.id("FirstName")).sendKeys(fn);
	driver.findElement(By.id("LastName")).sendKeys(ln);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(pwd);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(pwd);
	driver.findElement(By.id("register-button")).click();
}
}
