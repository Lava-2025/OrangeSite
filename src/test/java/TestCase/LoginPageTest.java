package TestCase;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginOrrange;
//public static LoginOrrange lo=new LoginOrrange(TestBase.driver);

public class LoginPageTest
{
	@Test
	public void loginPage()
	{
		TestBase.Setup();
		LoginOrrange lo=new LoginOrrange(TestBase.driver);
		lo.loginCredential();
		Reporter.log("successfully logged in");
	}
}











