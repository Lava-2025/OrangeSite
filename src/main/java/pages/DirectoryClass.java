package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class DirectoryClass extends TestBase
{

	public DirectoryClass(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[text()='Directory']")
	public WebElement Directory;
	
	@FindBy(xpath="//div[contains(@class,'oxd-autocomplete-text-input oxd-autocomplete')]")
	public WebElement Employee_Name;
	
	@FindBy(xpath="//button[text()=' Search ']")
	public WebElement Search;
	
	public void directoryMethod()
	{
		
		ClickElement(Directory);
		EnterText(Employee_Name,"Ravi M B");
		ClickElement(Search);
		
	}
	

}
