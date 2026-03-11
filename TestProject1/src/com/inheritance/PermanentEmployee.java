package com.inheritance;

public class PermanentEmployee extends Employee {
	int bonus;

	public PermanentEmployee(int empId, String name, double salary, int bonus) {
		super(empId, name, salary);
		this.bonus = bonus;

	}

	public void calculatePerk(int bonus) {
		System.out.println(bonus+salary);

	}

	public void calculatePerk(int hra, int bonus) {
		System.out.println(bonus+salary+hra);

	}
	public void displayDetails() {
		
		//calling display method of parent class
		super.displayDetails();
		System.out.println(bonus);
	}

}
