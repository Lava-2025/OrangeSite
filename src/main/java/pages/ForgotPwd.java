package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class ForgotPwd extends TestBase
{

	public ForgotPwd(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header'] | //p[contains(text(), 'Forgot')]")
	public WebElement Forgot;
	
	@FindBy(xpath="//input[@placeholder='Username'][@name='username']")
	public WebElement username;
	
	@FindBy(xpath="//button[@type='button']")
	public WebElement Cancel;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement Reset;
	
	@FindBy(xpath="//h6")
	public WebElement Message;
	
	
	public void cancel()
	{
		ClickElement(Forgot);
		EnterText(username,"Admin");
		ClickElement(Cancel);
	}
	public void reset()
	{
		ClickElement(Forgot);
		EnterText(username,"Admin");
		waitIsEnabled(Reset);
		ClickElement(Reset);
		String text=Message.getText();
		System.out.println(text);
	}
	

}
