package com.file.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UseStudentObjects {
public static void main(String[] args) {
		
		Student[] students = new Student[5];
		Scanner read = new Scanner(System.in);
		

		for(int i = 0; i < 5; i++ ) {
			students[i] = new Student();
			students[i].acceptData(read);
			System.out.println("------------------");
		}
		
		try {
			System.out.println("Writing data into file...");
			FileOutputStream out = new FileOutputStream("Student.txt");
			ObjectOutputStream os = new ObjectOutputStream(out);
			for( Student st: students) {
				os.writeObject(st);
			}
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream in;
		try {
			System.out.println("reading data from file");
			in = new FileInputStream("Student.txt");
			ObjectInputStream is = new ObjectInputStream(in);
			Student[] readstudent = new Student[5];
			for(int i = 0; i < 5; i++) {
				readstudent[i] = new Student();
				readstudent[i] = (Student) is.readObject();
			}
			System.out.println();
			for(Student st : readstudent) {
				System.out.println(st.toString());
				System.out.println("------------------");
			}
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
