package com.practice;

import java.util.Scanner;

public class StackByArray {
	int[] arrayStack;
	int top;
	public StackByArray(int capacity) {
		arrayStack = new int[capacity];
		top=-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==arrayStack.length-1;
		
	}
	public void push(int x) {
		if(isFull()) {
			System.out.println("your stack is full");
			return;
		}else {
			arrayStack[++top]=x;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("your stack is empty");
			return -1;
		}
		return arrayStack[top--];
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int val=sc.nextInt();
		StackByArray st= new StackByArray(val);
		for(int i=0;i<val;i++) {
			int s = sc.nextInt();
			st.push(s);
		}
		System.out.println("popping out the element form the stack");
		for(int j=0;j<val;j++) {
			System.out.println(st.pop());
		}
		
	}

}
