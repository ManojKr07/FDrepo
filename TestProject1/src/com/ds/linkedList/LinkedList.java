package com.ds.linkedList;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;

		}

	}

	public void insertAtFirst(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	public void insertAfterNode(int previousData, int addData) {

		Node temp = head;
		while (temp != null) {
			if (temp.data == previousData) {
				Node newNode = new Node(addData);
				newNode.next = temp.next;
				temp.next = newNode;
				return;
			}
			temp = temp.next;
		}
	}

	public void insertAtEnd(int newData) {
		Node newNode = new Node(newData);
		if (head == null) {
			head = newNode;
			return;
		} else {
			Node last;
			last = head;
			while (last.next != null) {
				last = last.next;
			}
			// move the control to the end of the list after completion
			last.next = newNode;
		}
	}

	public void deletNode(int val) {
		boolean found = searchNode(val);
		if (found) {
			if (head.data == val) {
				head = head.next;
			} else {
				Node temp = head.next;
				Node prev = head;
				while (temp != null) {
					if (temp.data == val) {
						prev.next=temp.next;
					}
					prev = prev.next;
					temp = temp.next;
				}

			}
		} else {
			System.out.println("element not found");
		}
	}

	boolean searchNode(int key) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == key) {
				return true;
			} else {
				temp = temp.next;
			}
		}
		return false;

	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList nodeList = new LinkedList();
		nodeList.insertAtEnd(5);
		nodeList.insertAtEnd(6);
		nodeList.insertAtEnd(7);
		nodeList.insertAtEnd(8);
		nodeList.insertAtEnd(10);

		nodeList.insertAtFirst(11);
		nodeList.insertAtFirst(56);
		nodeList.insertAfterNode(6, 33);
		
		
		nodeList.printList();
		System.out.println("nodeList after the deleting the head");
		nodeList.deletNode(56);
		nodeList.deletNode(7);
		
		nodeList.printList();

		boolean result1 = nodeList.searchNode(4);
		System.out.println(result1);

		boolean result2 = nodeList.searchNode(5);
		System.out.println(result2);

	}

}
