package SetUp;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

public class TestDemo {
	
	@BeforeSuite
	public void m1() 
	{
		System.out.println("Before Suite");
	}
	@BeforeMethod
	public void m2() 
	{
		System.out.println("Before Method");
	}
	@BeforeClass
	public void m3() 
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void m5() 
	{
		System.out.println("Before Method");
	}
	@BeforeTest
	public void m6() 
	{
	   System.out.println("Before Test");
	}
	@Test
	public void test1() 
	{
		System.out.println("Test 1");
	}
	@Test
	public void test2() 
	{
		System.out.println("Test 2");
	}
	@AfterSuite
	public void m7() 
	{
		System.out.println("M7 of After suite");
	}
	@AfterTest
	public void m8() 
	{
		System.out.println("After Test");
	}
	@AfterClass
	public void m9() 
	{
		System.out.println("After class");
	}
	@AfterMethod
	public void m10() 
	{
		System.out.println("After Method");
	}

}
