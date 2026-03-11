package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class UseEmployee {
	public static void main(String[] args) {
		LinkedList<Employee> empList = new LinkedList<Employee>();
		System.out.println("adding employee data  to the linkedlist");
		empList.add(new Employee(1, "alex", 12000.4));
		empList.add(new Employee(2, "peter", 12000.4));
		empList.add(new Employee(3, "john", 12000.4));
		double totalSal=0;
		for (Employee empData : empList) {
			empData.displayData();
			totalSal+=empData.salary;
			
		}
		System.out.println(totalSal);
		
		System.out.println("removing the data from the linked list");
		empList.remove(2);
		for (Employee empData : empList) {
			empData.displayData();
			totalSal+=empData.salary;
		}
		
		
	}
	
}
