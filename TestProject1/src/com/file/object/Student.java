package com.file.object;

import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Student implements Serializable{
	private int rollNo;
	private String name;
	private int mathScore;
	private int englishScore;
	private int scienceScore;
	public Student(int rollNo, String name, int mathScore, int englishScore, int scienceScore) {
		this.rollNo = rollNo;
		this.name = name;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		this.scienceScore = scienceScore;
	}
	public Student() {
		this.rollNo=0;
		this.name="";
		this.englishScore=0;
		this.mathScore=0;
		this.scienceScore=0;
		
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public int getScienceScore() {
		return scienceScore;
	}
	public void setScienceScore(int scienceScore) {
		this.scienceScore = scienceScore;
	}
	
	public void acceptData( Scanner read ) {
    	System.out.println("Enter Students details: ");
		rollNo = read.nextInt();
		read.nextLine();
		name = read.nextLine();
		mathScore = read.nextInt();
		scienceScore = read.nextInt();
		englishScore = read.nextInt();

	}
	
	@Override
	public String toString() {
		return "Student--->rollNo=" + rollNo + ", name=" + name + ", mathScore=" + mathScore + ", englishScore="
				+ englishScore + ", scienceScore=" + scienceScore+ " totalMarks= "+grandtotal()+ " percentage= "+ calculatePercentage();
	}
	public int grandtotal() {
		int total=0;
		return total+=mathScore+scienceScore+englishScore;

	}
	public double calculatePercentage() {
		
		return (grandtotal()/300)*100;

	} 
	
}
