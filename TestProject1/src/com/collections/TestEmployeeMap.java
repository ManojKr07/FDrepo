package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestEmployeeMap {
	public static void main(String[] args) {
		Map<Integer, Employee> empMap= new HashMap<Integer, Employee>();
		empMap.put(101, new Employee("Alex", 2400));
		empMap.put(102, new Employee("John", 4500));
		empMap.put(103, new Employee("peter", 2900));
		
		System.out.println("Employee data in hashmapped");
		for (Map.Entry<Integer, Employee> m1 : empMap.entrySet()) {
			System.out.println("key="+ m1.getKey()+ "->");
			m1.getValue().displayData();
		}
		System.out.println("\n Access employee with if 102: ");
		Employee emp = empMap.get(101);
		if(emp != null) {
			emp.displayData();
		}
		System.out.println("\n removing employee with of 103: ");
		empMap.remove(103);

		System.out.println("\n  employee data after removal: ");
	}

}
