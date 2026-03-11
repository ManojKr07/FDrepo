package com.file.object;

import java.io.File;
import java.io.IOException;

public class DemoFileIo {
public static void main(String[] args) {
	File file =new File("demo.txt");
	try {
		if(file.createNewFile()) {
			System.out.println("file created sucessfully");
		}else {
			System.out.println("file exists");
		}
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getParent());
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
