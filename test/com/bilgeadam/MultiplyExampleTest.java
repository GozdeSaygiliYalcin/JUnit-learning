package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MultiplyExampleTest {
	
	MultiplyExample multiplyExample;

	@BeforeEach
	void setUp() {
		multiplyExample = new MultiplyExample();
	}
	@Test
	void testMultiply() {
		assertEquals(20, multiplyExample.multiply(4,5), "Regular multiplication");	//yanına string tipinde not da yazdıraibiliyoruz
	}
	
	@Test
	@DisplayName("Ensure correct handling of zero") 
	void testMultiplyWithZero() {
		assertEquals(0, multiplyExample.multiply(0, 5));
		assertEquals(0, multiplyExample.multiply(5, 0));
	}

}
