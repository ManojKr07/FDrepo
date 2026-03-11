package com.exceptions;

public class TestThrow {
	public static void checkAge(int age) throws ArithmeticException, RuntimeException {
		if(age<18) {
			throw new ArithmeticException("under age cannot be processed");
		}else {
			System.out.println("age is valid");
		}
		if(age>50) {
			throw new RuntimeException("over age ");
		}else {
			System.out.println(" age is valid");
		}
	}
	public static void main(String[] args) {
		
		try {
			checkAge(20);
		}catch (ArithmeticException e) {
			System.out.println("Exception caught "+ e.getMessage());
		}finally {
			System.out.println("i will any ways execute it");
		}
		
	}
	

}
