package com.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<Employee> nameSet= new HashSet<Employee>();
		nameSet.add(new Employee(101, "alex", 23553));
		nameSet.add(null);
		nameSet.add(new Employee(101, "alex", 23553));
		for (Employee employee : nameSet) {
			if(employee!=null) {
				employee.displayData();
			}
		}
		Employee e1 = new Employee("alex", 1234);
		Employee e2 = new Employee("alex", 1234);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		
		
	}

}
