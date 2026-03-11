package com.ds.stack;

public class StackByLinkedList {
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	private Node top;
	StackByLinkedList(){
		top= null;
	}
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next=top;
		top = newNode;
		
		System.out.println("Data has been pushed");
	}
	public int pop() {
		if(top==null) {
			System.out.println("stack is empty");
			return -1;
		}else {
			int temp=top.data;
			top=top.next;
			return temp;
			
		}
	}
	public static void main(String[] args) {
		StackByLinkedList stackList=new StackByLinkedList();
		stackList.push(10);
		stackList.push(20);
		stackList.push(30);
		stackList.push(40);
		stackList.push(50);
		
		System.out.println("popped elements:");
		System.out.println(stackList.pop());
		System.out.println(stackList.pop());
		System.out.println(stackList.pop());
		System.out.println(stackList.pop());
		System.out.println(stackList.pop());
		System.out.println(stackList.pop());
	}

}
