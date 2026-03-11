package com.file.object;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String name;
	private transient double sal;
	

	public Employee(int id, String name, double sal) {

		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public Employee() {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", sal=" + sal;
	}
	
	

}
