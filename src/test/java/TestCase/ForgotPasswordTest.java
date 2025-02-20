package TestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ForgotPwd;

public class ForgotPasswordTest 
{
	@Test
	public void ForgotPassword()
	{
		TestBase.Setup();
		ForgotPwd forgot = new ForgotPwd(TestBase.driver);
		forgot.cancel();
		Reporter.log("Cancel verified successfully");
		forgot.reset();
		Reporter.log("Reset verified successfully");
		TestBase.quitBrowser();
	}
}
