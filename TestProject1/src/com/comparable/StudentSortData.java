package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortData {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101,"Arjun", 19));
		studentList.add(new Student(102,"Varun", 21));
		studentList.add(new Student(103,"Ajay", 18));
		
		System.out.println("details of the students");
		System.out.println(studentList);
		
		Collections.sort(studentList);
		System.out.println(studentList);
		
	}

}
