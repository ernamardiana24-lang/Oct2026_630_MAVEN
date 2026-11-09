package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario 
{
	@Test
	public void test1() 
	{
		System.out.println("Hello Test NG");
		
		Assert.assertEquals(12, 12);
	}
	
}
