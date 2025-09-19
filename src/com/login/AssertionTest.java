package com.login;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import org.junit.jupiter.api.Test;

class AssertionTest {
	@Test
	void exampleTest() {
		boolean result = someMethod();
		//Assertions.assertEquals(42, result, "The result should be 42");
		//Assertions.assertTrue(result, "The result should be 42");
		assertTrue(result, "Valid login should return true");
	}

	boolean someMethod() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
