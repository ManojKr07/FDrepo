package com.assignmentDay4;

import java.util.ArrayList;
import java.util.Scanner;

public class UseEmployee {
	public static void main(String[] args) throws InvalidSalaryException {
		ArrayList<Employee> empList = new ArrayList<>();
		try {
			empList.add(new Employee(101, "alex", 10024));
			empList.add(new Employee(102, "peter", 2065));
			empList.add(new Employee(103, "maxi", 7286));
			
		}catch (InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter employee Id to search: ");
		int searchId = sc.nextInt();
		
		Employee searchEmp = new Employee(0, "", 0);
		try {
			searchEmp = new Employee(101, "alex", 10024);
		}catch (InvalidSalaryException e) {
			e.getMessage();
		}
		if(empList.contains(searchEmp)) {
			for(Employee e : empList) {
				if(e.equals(searchEmp)) {
					System.out.println("employee found : "+ e);
				}
				
			}
			
		}else {
			System.out.println("Employee with Id: "+searchId+" not found");
		}
	}

}
