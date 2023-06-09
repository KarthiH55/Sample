package com.demoWebShop.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Class 
{
public WebDriver driver;
@Parameters({"URL","Keys","Values"})
@BeforeMethod
public void openApp(String url,String key,String value)
{
	System.setProperty(key,value);
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get(url);
}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
