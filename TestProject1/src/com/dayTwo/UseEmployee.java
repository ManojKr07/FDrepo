package com.dayTwo;

public class UseEmployee {

	public static void main(String[] args) {
		Employee[] employees=new Employee[5];
		employees[0]= new Employee("maxi", 1234.654);
		employees[1]= new Employee("alex", 965.654);
		employees[2]= new Employee("jack", 3265.654);
		employees[3]= new Employee("john", 1477.654);
		employees[4]= new Employee("rose", 876.654);
		double totalSalary=0;
		for(int i=0;i<employees.length;i++) {
			employees[i].displayData();
			totalSalary+=employees[i].getSalary();
		
		}
		System.out.println("total salary of all the emplyees is:"+ totalSalary);
		
		
		

	}

}
