package com.collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	public int empId;
	public String empName;
	public double empSal;
	public int bonus;
	public EmployeeList(int empId, String empName, double empSal, int bonus) {
		this.empId = empId;
		this.empName = empName;
		this.bonus=bonus;
		this.empSal=empSal;
		
	}
	public void displayData() {
		System.out.println("****************");
		System.out.println("employee Id is:" + empId);
		System.out.println("name of the employee is:" + empName);
		System.out.println("salary is:" + empSal);
		System.out.println("bonus is:" + bonus);

	}

	public static void main(String[] args) {
		ArrayList<EmployeeList> empList = new ArrayList<EmployeeList>();
		empList.add(new EmployeeList(1, "alex", 12000.4, 540));
		empList.add(new EmployeeList(2, "peter", 12000.4, 540));
		empList.add(new EmployeeList(3, "john", 12000.4, 540));
		for (EmployeeList empData : empList) {
			empData.displayData();
		}
		
	}

}
