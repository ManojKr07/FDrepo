package com.dayTwo;

public class ArrayExample {
	public static void main(String[] args) { 
		int[] myArray= {2,3,4,5,6};
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		//create salary of five employee using array and do 10% increment at each salary and show the data
		double[] empSalary= {1076.87, 2000.4, 3215.08, 2345.98};
		for(int i=0;i<empSalary.length;i++) {
			double incrementSal=empSalary[i]*0.10;
			System.out.println(empSalary[i]+incrementSal);
		}
	}
}
