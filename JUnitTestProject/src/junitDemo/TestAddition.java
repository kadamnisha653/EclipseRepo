package junitDemo;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAddition {

	static Addition a1;
	
	@BeforeClass
	public static void createObject()
	{
		System.out.println("Program Started");
		a1 = new Addition();
	}
	
	@Test
	public void testAdd() {
		
		Assert.assertEquals(7 , a1.add());
		System.out.println("Expected Addition Matched");
	}
	
	@Test
	public void testSub()
	{
		Assert.assertEquals(-1, a1.sub());
		System.out.println("Difference is matched");
	}
	
	@AfterClass
	public static void endTest()
	{
		System.out.println("Program ended");
	}

}
