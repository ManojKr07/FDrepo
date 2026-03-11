package com.fileInputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TestFileIo {
	public static void main(String[] args) throws IOException{
		// writing to a file
		String fileName = "data.txt";
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(fileName);
			String message = "hello team";// convert message to byte array, bcoz write need the byte arry to convert
			byte[] data = message.getBytes();
			out.write(data);
			System.out.println("data written sucessfuly..!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
		System.out.println("reading from the file");
		FileInputStream in = new FileInputStream(fileName);
		int byteData;
		while ((byteData = in.read()) != -1) {
			System.out.print((char) byteData);
		}
		in.close();
	}

}
