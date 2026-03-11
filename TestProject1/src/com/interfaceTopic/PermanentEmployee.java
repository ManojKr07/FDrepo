package com.interfaceTopic;

public class PermanentEmployee extends Employee{
	private double bonus;
	private double pf;
	public PermanentEmployee(int empId, String name, double basicSalary, double bonus, double pf) {
		super(empId, name, basicSalary);
		this.bonus = bonus;
		this.pf = pf;
	}
	public double calculateSalary() {
		return basicSalary + bonus - pf;

		
	}

}
