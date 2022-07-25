package com.bilgeadam;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MyMathTest {
	
	MyMath myMath = new MyMath();
	
	@BeforeEach //her testten önce bir kez çalışıyor
	public void before () {
		System.out.println("Before");
	}
	
	@AfterEach
	public void after() { //her testten sonra bir kez çalışıyor. 
						//Bunun için database close() metodu yazdırılarak connectionun her defasında kapatıldığından emin olabiliriz.
		System.out.println("After");
	}
	
	@BeforeAll 
	public static void beforeAll () {
		System.out.println("BeforeAll");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("AfterAll");
	}

	@Test
	void sumWith3Numbers() {
				
		int result = myMath.sum(new int [] {1,2,3});

		assertEquals(6, result);	
		System.out.println("Inside sum with 3numbers test");
	}
	
	@Test
	void sumWith2Numbers() {
		
		int result = myMath.sum(new int [] {1,2});
		
		assertEquals(3, result);
		System.out.println("Inside sum with 2numbers test");
	}

}
