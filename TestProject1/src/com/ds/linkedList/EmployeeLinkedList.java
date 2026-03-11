package com.ds.linkedList;

public class EmployeeLinkedList {
	private Node head;
	
	public void add(Employee emp) {
		Node newNode = new Node(emp);
		if(head==null) {
			head=newNode;
			return;			
		}
		Node temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}

	}
	public Employee search(int id) {
		Node temp = head;
		while(temp != null) {
			if(temp.data.getInt()==id) {
				return temp.data;
			}
				
				temp =temp.next;
			}
		return null;
	}

}
