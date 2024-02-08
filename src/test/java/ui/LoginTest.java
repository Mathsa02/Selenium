package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("Login to Application");
	}
	@AfterTest
	public void logOutApplication()
	{
		System.out.println("Logout from Application");
	}
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB connected");
	}
	@AfterMethod
	public void disconnectFromDB()
	{
		System.out.println("DB disconnected");
	}
	
	@Test(priority=1,description="this is a login test")
	public void aTest1()
	{
		System.out.println("test1");
		
	}
	@Test(priority=2,description="this is a logout test")

	public void bTest2()
	{
		System.out.println("test2");
		
		
	}
		
	
}
