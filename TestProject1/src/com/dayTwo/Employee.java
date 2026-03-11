package com.dayTwo;

import java.util.Scanner;

public class Employee {
    private int empId;
    private String name;
    private double salary;

    // Static counter to auto-generate employee IDs
    private static int counter = 100; // starting ID

    // Default constructor
    public Employee() {
        this.empId = ++counter;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    // Parameterized constructor
    public Employee(String name, double salary) {
        this.empId = ++counter;
        this.name = name;
        this.salary = salary;
    }

    // Method to accept data from user
    public void acceptData(Scanner sc) {
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Salary: ");
        this.salary = sc.nextDouble();
        sc.nextLine(); // consume newline
    }

    // Method to display employee details
    public void displayData() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    // Method to increment salary
    public void incrementSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("Salary incremented by " + percentage + "%.");
        } else {
            System.out.println("Invalid increment percentage.");
        }
    }

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

    

}
