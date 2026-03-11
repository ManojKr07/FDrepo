package com.collections;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	public int empid;
	public  String name;
	public double salary;
	
	
	static int counter = 0;
	
	public Employee(int empid, String name, double salary){
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	Employee( String name, double salary){
		empid = ++counter;
		this.name = name;
		this.salary = salary;
	}
	
	public void acceptData( Scanner read ) {
		empid = ++counter;
		
		System.out.println("Enter Employee Name: ");
		read.nextLine();
		name = read.nextLine();
		
		System.out.println("Enter Employee Salary: ");
		salary = read.nextDouble();

	}
	
	void displayData() {
		System.out.println();
		System.out.println("Employee Id: " + empid);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(empid, name, salary);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return empid == other.empid && Objects.equals(name, other.name)
//				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
//	}
	
}
