package com.sachin.arrays;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Array can take any element of Reference subtype.
 * 
 * Arrays are covariant : EmployeeArray can be assigned with array of it subtype classes.
 * 
 * @author sbhosale
 *
 */
public class CovariantDemo {
	
	
	public static void main(String[] args) {
		
		Employee[] empArr = new Employee[2];
		
		ContractEmployee contractEmployee = new ContractEmployee();
		empArr[0] = contractEmployee;
		empArr[1] = new Employee();
		
		ContractEmployee[] contractArr = new ContractEmployee[4];
		
		empArr = contractArr;
		
		Serializable[] serArr = empArr;
		serArr = contractArr;
		
		List<? extends Employee> empList = new ArrayList<CovariantDemo.Employee>();
		
		List<ContractEmployee > contractEmployees = new ArrayList<CovariantDemo.ContractEmployee>();
		
		//Cannot assign the list of contract employees to employees.
//		empList = contractEmployee;
		
	}
	
	private static class Employee implements Serializable{
		
		private int empId;
		private String name;
	}
	
	private static class ContractEmployee extends Employee implements Serializable{
		private int contractId;
	}

}
