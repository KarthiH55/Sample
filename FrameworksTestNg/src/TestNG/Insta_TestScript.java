package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Insta_TestScript 
{
@Test
public void script() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./Software1/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(1000);
	Pom_Class pmc=new Pom_Class(driver);
	Thread.sleep(3000);
	pmc.username("First");
	Thread.sleep(3000);
	pmc.password("Pass1");
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	pmc.username("First1");
	Thread.sleep(3000);
	pmc.password("Pass2");
	
	
}
}
