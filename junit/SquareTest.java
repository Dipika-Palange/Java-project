package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
	
		JUnitEx testcase=new JUnitEx();
		int sq=testcase.square(5);
		 
		assertEquals(25, sq);
		
	
	}

}
