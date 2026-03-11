package com.fileInputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter("temp.txt");
			fw.write("I am writing the data using file writer");
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("file written sucessfully");
		
		
		try {
			FileReader fr = new FileReader("temp.txt");
			int i;
			while((i=fr.read()) !=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
