package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitAnnotations {
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("in before class");
	}

	@Before
	public  void before()
	{
		System.out.println("in before ");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("in after class");
	}
	
	@After

	public  void after()
	{
		System.out.println("in after");
	}
	
	@Test
	public  void test()
	{
		System.out.println("in test");
	}
	
	@org.junit.Ignore
	public  void Ignore()
	{
		System.out.println("in ignore");
	}



}
