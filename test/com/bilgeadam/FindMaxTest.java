package com.bilgeadam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindMaxTest {
	
	FindMax findMaxTest;
	
	@BeforeEach
	void setUp() {
		findMaxTest = new FindMax();
	}

	@Test
	void MaxTestWith3Numbers() {
		
		int result = findMaxTest.findMax(new int [] {1,2,3});

		assertEquals(3, result);	
		System.out.println("Inside find with 3numbers test");
	}
	
	@Test
	void MaxTestWithNumbers() {
		
		int result = findMaxTest.findMax(new int [] {1,2,3,6,7,12,0,-1});

		assertEquals(12, result);	
		System.out.println("Inside find with numbers test");
	}
	
	@Test
	void MaxTestWithNegativeNumbers() {
		
		int result = findMaxTest.findMax(new int [] {-1, -2, -3, -7});
		
		assertEquals(-1, result);
		System.out.println("Inside find with negative numbers test");
		
	}

}
