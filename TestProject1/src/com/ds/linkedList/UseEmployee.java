package com.ds.linkedList;

public class UseEmployee {
	public static void main(String[] args) {
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.add(new Employee(101, "alex", 3455667));
		list.add(new Employee(102, "peter", 789432));
		list.add(new Employee(103, "john", 643257));
		list.add(new Employee(104, "jack", 65412234));
		
		System.out.println("employee linked list:");
		list.display();
		
		int searchId=102;
		Employee emp = list.search(searchId);
		
		if(emp != null) {
			System.out.println("Employee found:" + emp);
		}else {
			System.out.println("employee with id" +searchId+"not found");
		}
	}
	

}
