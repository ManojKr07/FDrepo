package com.basic;

import java.util.Scanner;

public class Employee {
	private static int empid;
	private String name;
	private double salary;
	static int counter = 100;

	public Employee() {
		counter++;
		empid = counter;
		name = "not set";
		salary = 0.00;

	}

	public Employee(String name, double salary) {
		this.empid = counter++;
		this.name = name;
		this.salary = salary;

	}

	public void acceptdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name:");
		this.name = sc.nextLine();
		System.out.println("enter the salary: ");
		this.salary = sc.nextDouble();
	}

	public void displayData() {
		System.out.println("employee Id is:" + empid);
		System.out.println("name of the employee is:" + name);
		System.out.println("salary is:" + salary);

	}

	public void incrementSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the increment amount");
		double incAmt = sc.nextDouble();
		this.salary += incAmt;
		System.out.println("Salary updated");
		System.out.println("Salary after increment:" + salary);

	}

}
