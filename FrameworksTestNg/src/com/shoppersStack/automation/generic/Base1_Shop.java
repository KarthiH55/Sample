package com.shoppersStack.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base1_Shop 
{
	public WebDriver driver;
	@Parameters({"URL","Keys","Values"})
@BeforeMethod
public void openApp(String url,String key1,String value1 )
{
	System.setProperty(key1,value1);
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get(url);
	
}
@AfterMethod
public void closeApp()
{
	driver.close();
}
}
