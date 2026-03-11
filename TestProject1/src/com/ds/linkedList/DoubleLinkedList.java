package com.ds.linkedList;


public class DoubleLinkedList {
	Node head;

	class Node {
		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			this.next = null;
			this.prev=null;
		}
	}

	public void insertAtFirst(int newData) {
		Node newNode = new Node(newData);
		
		if(head == null) {
			newNode.next=head;
			newNode.prev=null;
			head=newNode;
		}else {
			Node temp = head;
			while(temp.next !=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
			
		}
	}
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void printBytail() {
		Node tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		 while(tail != null) {
			 System.out.println(tail.data);
			 tail = tail.prev;
		 }
	}
	public static void main(String[] args) {
		DoubleLinkedList ls=new DoubleLinkedList();
		ls.insertAtFirst(5);
		ls.insertAtFirst(6);
		ls.insertAtFirst(7);
		ls.insertAtFirst(8);
		ls.insertAtFirst(5);
		
		System.out.println("printing the element from first");
		ls.printList();
		
		System.out.println("printing the element from last");
		ls.printBytail();
	}

}
