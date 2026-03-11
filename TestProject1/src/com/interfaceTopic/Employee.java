package com.interfaceTopic;

abstract public class Employee implements Payable {
	protected int empId;
	protected String name;
	protected double basicSalary;
	public Employee(int empId, String name, double basicSalary) {
		super();
		this.empId = empId;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	//it is an abstract method we dont know the implementation
//	public abstract double calculateSalary();
	
	public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}