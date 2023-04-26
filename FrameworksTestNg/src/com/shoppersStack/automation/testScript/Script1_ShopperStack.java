package com.shoppersStack.automation.testScript;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shoppersStack.automation.generic.Base1_Shop;
import com.shoppersStack.automation.generic.DataProvider1_Shop;

public class Script1_ShopperStack extends Base1_Shop
{
	
@Test(dataProvider = "Data1",dataProviderClass = DataProvider1_Shop.class)
public void cart(String email,String pwd) throws InterruptedException
{
	driver.findElement(By.id("loginBtn")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("Email")).sendKeys(email);
	Thread.sleep(3000);
	driver.findElement(By.id("Password")).sendKeys(pwd);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Login']")).click();
}   
}
