package com.fileInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class TestCopyInputToTarget {
public static void main(String[] args) throws IOException {
	String filename1="source.txt";
	String filename2="target.txt";
	FileOutputStream out=null;
	FileInputStream in=null;
	try {
		out = new FileOutputStream(filename1);
		String msg = "I am doing the copying operation in File handling";
	
		byte[] data=msg.getBytes();
		out.write(data);
		out.close();
		System.out.println("I written the data to source.txt sucessfully..!");
		
		
		
		System.out.println("copying the data from source.txt to target.txt file");
		in = new FileInputStream(filename1);
		out = new FileOutputStream(filename2);
		int x=0;
		while((x=in.read())!=-1) {
			out.write(x);
		}
		
		
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		out.close();
	}
	System.out.println("reading data from target.txt file");
	FileInputStream in1 = new FileInputStream(filename2);
	int byteData;
	while ((byteData = in1.read()) != -1) {
		System.out.print((char) byteData);
	}
	in1.close();
	
	
	
	
	
}
}
