package com.abstraction;

public class UseEmployee {
	public static void main(String [] args) {
		Employee e1 = new PermanentEmployee(1, "abc", 45000, 2000, 199);
		e1.displayDetails();
		System.out.println(e1.calculateSalary());
	}

}
