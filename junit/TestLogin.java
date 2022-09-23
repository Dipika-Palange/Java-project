package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogin {

	@Test
	public void testCorrectLogin() {
		Login login =new Login();
		login.setUsername("admin");
		login.setPassword("admin123");
		
		assertTrue(login.checkLogin());
	}
	
	@Test
	public void testWrongLogin() {
		Login login =new Login();
		login.setUsername("admin1");
		login.setPassword("admin1234");
		
		assertFalse(login.checkLogin());
	}

}
