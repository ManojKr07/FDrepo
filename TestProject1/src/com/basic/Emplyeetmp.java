package com.basic;

import java.util.Scanner;

public class Emplyeetmp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		int choice;
		do {
			System.out.println("1. Enter the emplyee details:");
			System.out.println("2. Display Employee details");
			System.out.println("3. Increment Salary:");
			System.out.println("4.exit");
			System.out.println("enter the choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				emp.acceptdata();
					break;
			case 2:
				emp.displayData();
				break;
			case 3:
				emp.incrementSalary();
				break;
			case 4:
				System.out.println("Exiting the program.....");
				break;
			default:
				System.out.println("invalid choice!..try with other choice.");
			}
			
		}while(choice!=4);
		
	}

}
