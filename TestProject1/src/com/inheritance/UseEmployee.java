package com.inheritance;

public class UseEmployee {
	public static void main(String[] args) {
		PermanentEmployee p1=new PermanentEmployee(1 , " anderson", 3000.086, 1500);
		System.out.println(p1.empId+p1.name+p1.salary+p1.bonus);
		
		p1.calculatePerk(30);
		p1.calculatePerk(54, 78);
		
		ContractualEmployee c1=new ContractualEmployee(2, "arjun", 1300.33, 10);
		System.out.println(c1.empId+c1.name+c1.salary+c1.noOfHours);
		
		//super class refrence holding subclass object
		Employee e2=new PermanentEmployee(1, "anderson", 3000.086, 1500);
		
		if(e2 instanceof PermanentEmployee) {
			PermanentEmployee p2=(PermanentEmployee)e2;
			p2.calculatePerk(20);
		}
			
		Employee e3=new  ContractualEmployee(2, "john", 1300.33, 10);
	}

}
