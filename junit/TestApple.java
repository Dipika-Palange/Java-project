package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApple {

	@Test
	public void testCorrectColor() {
	 Apple apple=new Apple();
	 apple.setColor("Green");
	 assertTrue(apple.checkcolor());
		
	}
	
	@Test
	public void testWrongColor() {
		Apple apple=new Apple();
		apple.setColor("Blue");
	    assertFalse(apple.checkcolor());
	}
	

}
