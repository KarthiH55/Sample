package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Facebook_Testscript 
{
@Test
public void Facebook() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./Software1/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	
	Pom_ClassF pmc=new Pom_ClassF(driver);
	pmc.username("First");
	pmc.password("password");
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	pmc.username("First1");
	Thread.sleep(3000);
	pmc.password("Pass2");
}
}
