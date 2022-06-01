package Amazonfram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions {

	@BeforeClass
	public void demo()
	{
		System.out.println("before class");
		
	}
	@BeforeMethod
	public void alpha()
	{
		System.out.println("before method");
	}
	
	@Test
	public void testB()
	{
		System.out.println("testB");
	}
	@Test
	public void testA()
	{
		System.out.println("testA");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logoutafterclick"); //logoutclick
	}
    @AfterClass
    public void afterclass()
    {
    	System.out.println("after class");
    }
    
	}

