package com.test2;

import java.util.LinkedList;
import java.util.Scanner;

public class TaskManager {

	LinkedList<Task> tasks = new LinkedList<>();
	Scanner sc = new Scanner(System.in);

	public void addTask() {
		System.out.println("enter the task ID:");
		int id = sc.nextInt();
		sc.nextLine();

		for (Task t : tasks) {
			if (t.getTaskId() == id) {
				System.out.println("task ID already exists! cannot add.");
				return;
			}
		}

		System.out.println("enter task name:");
		String name = sc.nextLine();

		System.out.println("enter priority: ");
		int priority = sc.nextInt();
		Task newTask = new Task(id, name, priority);
		tasks.add(newTask);
		System.out.println("task added sucessfully.");

	}

	public void removeTask() {
		System.out.println("enter Task Id to Remove ");
		int id = sc.nextInt();

		for (Task t1 : tasks) {
			if (t1.getTaskId() == id) {
				tasks.remove(t1);
				System.out.println("Task removed sucessfully");
				return;
			}

		}
		System.out.println("Task not found: ");

	}

	public void searchTask() {
		System.out.println("enter Task Id to Search ");
		int id = sc.nextInt();

		for (Task t2 : tasks) {
			if (t2.getTaskId() == id) {
				tasks.remove(t2);
				System.out.println("Task found: " + t2);
				return;
			}

		}
		System.out.println("Task not found: ");
	}

	public void displayTasks() {
		if (tasks.isEmpty()) {
			System.out.println("NO task available");
			return;
		}
		System.out.println("------all tasks----");
		for (Task t3 : tasks) {
			System.out.println(t3);
		}
	}

	public void processTask() {
		if (tasks.isEmpty()) {
			System.out.println("No task to process");
			return;
		}
		Task next = tasks.poll();
		System.out.println("Processing Task:");
		System.out.println(next);
	}

	public static void main(String[] args) {
		TaskManager tm = new TaskManager();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Task management menu");
			System.out.println("1. Add Task ");
			System.out.println("2. Remove Task");
			System.out.println("3. Search Task");
			System.out.println("4.Display All Tasks");
			System.out.println("5. Process Next Task");
			System.out.println("6.Exit");

			System.out.println("Enter your choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {

				tm.addTask();
				break;
			}
			case 2: {

				tm.removeTask();;
				break;
			}
			case 3: {

				tm.searchTask();
				break;
			}
			case 4: {

				tm.displayTasks();
				break;
			}
			case 5: {

				tm.processTask();
				break;
			}
			case 6: {

				System.out.println("existing......");
				return;
			}
			default:
				System.out.println("Invalid choice!.");
			}
		}
	}
}
