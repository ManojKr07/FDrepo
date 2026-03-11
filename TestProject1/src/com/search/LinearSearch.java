package com.search;

import java.util.Iterator;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr= {1,2, 3, 5, 6, 10};
		int target=40;
		int flag=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				flag=1;
			}
		}
		if(flag==1) {
			System.out.println("target is found");
		}else {
			System.out.println("target is not found");
		}
	}

}
