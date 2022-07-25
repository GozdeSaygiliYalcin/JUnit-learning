package com.bilgeadam.employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	EmployeeBusinessLogic ebl = new EmployeeBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();

	@Test
	void test() {
		
		employee.setName("boncuk");
		employee.setAge(3);
		employee.setMonthlySalary(10001);
		
		double actual = ebl.calculateBonus(employee);
		assertEquals(1000, actual);
	}
	
	@Test
	void testCalculateYearly() {
		
		employee.setName("boncuk");
		employee.setAge(3);
		employee.setMonthlySalary(10001);
		
		double actual = ebl.calculateYearlySalary(employee);
		assertEquals(120012, actual);
	}

}
