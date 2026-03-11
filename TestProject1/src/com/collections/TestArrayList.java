package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("alex");
		nameList.add("peter");
		nameList.add("john");
//		nameList.add(10);
//		nameList.add(98.32);
//		System.out.println(nameList.get(3));
		System.out.println(nameList);
		//for each
		for (String str : nameList) {
			System.out.println(str);
		}
		
		//iterator-traverse the elements - forward direction
		System.out.println("traversing elements using the iterator");
		Iterator<String> it = nameList.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
		System.out.println("traversing elements using the list iterator - foeward/backward");
		ListIterator<String> listIt = nameList.listIterator();
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		
		System.out.println("traversing elements using the list iterator - backward");
		while(listIt.hasPrevious()) {
			System.out.println(listIt.previous());
		}

}
}
