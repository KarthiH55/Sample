package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_ClassF
{
@FindBy(name="email")
private WebElement Email;
@FindBy (name="pass")
private WebElement Password;

public Pom_ClassF(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void username(String un)
{
Email.sendKeys(un);	
}
public void password(String pwd)
{
	Password.sendKeys(pwd);
}
}
