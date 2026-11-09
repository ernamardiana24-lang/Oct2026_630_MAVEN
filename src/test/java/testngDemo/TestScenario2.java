package testngDemo;

import org.testng.annotations.Test;

public class TestScenario2 
{
	@Test(priority=1)
	public void test1() 
	{
		System.out.println("This is my first test NG");
	}
	
	@Test(priority=2)
	public void test2() 
	{
		System.out.println("This is my second test NG");
	}
	
	@Test(priority=3)
	public void test3()
	{
		System.out.println("This is my third test NG");
	}
	
	@Test(priority=4)
	public void test4()
	{
		System.out.println("This is my fourth test NG");
	}
}
