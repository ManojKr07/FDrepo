package com.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("elements are sorted:");
		Arrays.sort(arr);
		for (int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("enter the Search elements");
		int searchElement=sc.nextInt();
		
		int res=binarySearch(arr,searchElement);
		
		if(res==-1) {
			System.out.println("element not found");
		}else {
			System.out.println("element is found at: "+arr[res]);
		}
	
		
	}

	private static int binarySearch(int[] arr, int key) {
		int low=0;
		int high=arr.length-1;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}else if (key<arr[mid]) {
				high=mid-1;//search left
			}else {
				low=mid+1;//searching right
			}
		}
		return 0;
	}

}
