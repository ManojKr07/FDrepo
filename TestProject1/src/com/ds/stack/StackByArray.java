package com.ds.stack;

import java.util.NoSuchElementException;

public class StackByArray {
	private int[] stack;
	private int top;
	public StackByArray(int capacity) {
		stack = new int[capacity];
		top=-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==stack.length-1;	
	}
	public void push(int x) {
		if(isFull()) {
			throw new IllegalStateException(); 
		}
		else {
			stack[++top]=x;
		}
	}
	public int pop() {
		if(isEmpty()) {
			throw new NoSuchElementException("stack is empty");
		}
		return stack[top--];
	}
	
	public static void main(String[] args) {
		StackByArray myStack=new StackByArray(5);
		System.out.println("pushing the values to stack");
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		myStack.push(6);
		System.out.println("pop the values from stack");
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
	}
	

}
