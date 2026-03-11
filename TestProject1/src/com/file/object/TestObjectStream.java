package com.file.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectStream {
	public static void main(String[] args) throws FileNotFoundException {
		Employee e1 = new Employee(101, "alex", 23465.97);
		try {
			FileOutputStream fout = new FileOutputStream("employee.txt");
			ObjectOutputStream out= new ObjectOutputStream(fout);
			out.writeObject(e1);
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		FileInputStream fin = new FileInputStream("employee.txt");
		try {
			ObjectInputStream in = new ObjectInputStream(fin);
			Employee e2 = (Employee) in.readObject();
			System.out.println(e2.toString());
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
