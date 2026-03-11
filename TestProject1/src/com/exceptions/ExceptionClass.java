package com.exceptions;

public class ExceptionClass {
	public static void main(String[] args) {
		try {
			int[] arr= {1,2,3,4,5,6};
			System.out.println(arr[7]);
			int x=5/0;
			System.out.println(x);
			String str="hello";
			System.out.println(str.length());
			
		}catch(ArithmeticException e){
			System.out.println("cannot divide the value by zero");
		}catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("fetching the element which is out of the limit");;
	}

}
}