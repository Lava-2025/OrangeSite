package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class LoginOrrange extends TestBase
{
    
	public LoginOrrange(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement UserName;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Submit; 
	
	public void loginCredential()
	{
		EnterText(UserName, "Admin");
		EnterText(Password, "admin123");
		waitIsEnabled(Submit);
		ClickElement(Submit);
	}
}
