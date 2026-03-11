package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("A",100);
		hm.put("z",200);
		hm.put("x",800);
		hm.put("r",260);
		hm.put("d",270);		
		hm.put(null,20007);
		hm.put(null,200);
		hm.put(null, null);
		hm.put(null, null);
		Set<Map.Entry<String, Integer>> st= hm.entrySet();
		for (Map.Entry<String, Integer> m1 : st) {
			System.out.print(m1.getKey()+":");
			System.out.println(m1.getValue());	
		}	
		
	}
	

}
