package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivideExampleTest {
	
	DivideExample divideExample;
	
	@BeforeEach
	void setUp() {
		divideExample = new DivideExample();
	}

	@Test
	void DivideZeroTest() {
		assertThrows(ArithmeticException.class, () -> divideExample.divide(121, 0));
		
	}
	
	@Test
	void DivideRegularTest() {
		assertEquals(10, divideExample.divide(100,10));
	}

}
