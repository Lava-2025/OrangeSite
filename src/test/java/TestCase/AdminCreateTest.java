package TestCase;

import org.testng.annotations.Test;

import base.TestBase;
import pages.Admin;

public class AdminCreateTest 
{
	@Test
public void addTest()
{
	Admin add=new Admin(TestBase.driver);
	
	add.add();
}
}