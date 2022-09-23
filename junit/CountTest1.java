package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountTest1 {

	@Test
	public void test() {
		
		JUnitEx testcase=new JUnitEx();
		int c=testcase.countA("Arya");
		assertEquals(2, c);
		
	}

}
