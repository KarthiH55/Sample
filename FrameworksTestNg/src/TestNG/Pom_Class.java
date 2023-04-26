package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class 
{

@FindBy(name="username")
private WebElement user_name;

@FindBy(name="password")    
private WebElement pass_Word;

public Pom_Class(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void username(String un)
{
	user_name.sendKeys(un);
}
public void password(String pwd)
{
	pass_Word.sendKeys(pwd);
}
}

