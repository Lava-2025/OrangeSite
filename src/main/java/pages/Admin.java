package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class Admin extends TestBase
{

	public Admin(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//ul[@class='oxd-main-menu']/li[1]/a/span[text()='Admin']")
	public WebElement Admin;
	
	@FindBy(xpath="//button[@type=\"button\"]/i[@class=\"oxd-icon bi-plus oxd-button-icon\"]")
	public WebElement Add;
	
	@FindBy(xpath="//div[@class=\"oxd-form-row\"]/div[@class=\"oxd-grid-2 orangehrm-full-width-grid\"]/div[1]/div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]")
	public WebElement UserName;
	
	@FindBy(xpath="//div[text()='Admin']")
	public WebElement optionOne;
	public void add()
	{
		ClickElement(Admin);
		ClickElement(Add);
		ClickElement(UserName);
		//selectOption(UserName, 2);
		ClickElement(optionOne);
		
		
		
	}
	


}
