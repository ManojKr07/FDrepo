package com.fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountData {
	public static void main(String[] args) throws IOException {
		String file= "file";
		FileWriter out=null;
		try {
			out = new FileWriter(file);
			String msg="counting the number for words and characters";
			out.write(msg);
			out.close();
			System.out.println("message is wriiten in the file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader in =new BufferedReader(new FileReader(file));
		int wordCount=0;
		int charCount=0;
		String line;
		while((line=in.readLine())!= null) {
			String[] words= line.split(" ");
			for (String word : words) {
				if(!word.isEmpty()) {
					wordCount++;
				}
				
			}
			System.out.println(charCount=line.length());
			
		}
		System.out.println(wordCount);
	}
	
	
	
}
