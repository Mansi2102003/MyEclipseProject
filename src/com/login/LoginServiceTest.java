package com.login;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoginServiceTest {
	 @Test
	    public void testValidLogin() {
	        LoginService service = new LoginService();
	        boolean result = service.login("admin", "password123");
	        assertTrue(result, "Valid login should return true");
	    }

	    @Test
	    public void testInvalidUsername() {
	        LoginService service = new LoginService();
	        boolean result = service.login("wrongUser", "password123");
	        assertFalse(result, "Invalid username should return false");
	    }

	    @Test
	    public void testInvalidPassword() {
	        LoginService service = new LoginService();
	        boolean result = service.login("admin", "wrongPass");
	        assertFalse(result, "Invalid password should return false");
	    }

	    @Test
	    public void testEmptyCredentials() {
	        LoginService service = new LoginService();
	        boolean result = service.login("", "");
	        assertFalse(result, "Empty username and password should return false");
	    }
	
}
