package junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestAssertionMethods {

	@Test
	public void testAssertion()
	{
		String str1=new String("Raj");
		String str2=new String("Raj");
		String str3="Welcome";
		String str4="Welcome";
		String str5=null;
		
		int a=10;
		int b=10;
		
		assertEquals(str1, str2);
		
		assertTrue(a==b);
		
		assertFalse(a>b);
		
		assertSame(str3, str4);
		
		assertNotSame(str1, str3);
		
		assertNull(str5);
		
		assertNotNull(str1);
		
		String a1[]= {"One","Two","Three"};
		String a2[]= {"One","Two","Three"};
		
		assertArrayEquals(a1, a2);
	}
}
