package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAge {

	@Test
	public void testCorrectAge() {
		Age age=new Age();
		age.setAge(20);
		assertTrue(age.checkAge());
	}
	@Test
	public void testWrongAge() {
		Age age=new Age();
		age.setAge(17);
		assertFalse(age.checkAge());
	}

}
