package TestCase;

import org.testng.annotations.Test;

import base.TestBase;
import pages.DirectoryClass;


public class DirectoryTest 
{
	@Test
	public void directory()
	{
		TestBase.Setup();
		DirectoryClass dc=new DirectoryClass(TestBase.driver);
		dc.directoryMethod();
	}

 
}
