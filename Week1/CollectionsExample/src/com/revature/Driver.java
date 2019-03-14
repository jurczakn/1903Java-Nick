package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Driver {
	
	public static void main(String[] args) {
		
		List<Integer> iList = new ArrayList<Integer>();
		
		iList.addAll(Arrays.asList(1, 2, 4, 5, 3, 18, 55, 1, 2));
		
		//Iterator allows us to cycle through a collection
		Iterator<Integer> iter = iList.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		Map<String, Integer> myMap = new TreeMap<String, Integer>();
		
		myMap.put("student a", 95);
		myMap.put("student b", 55);
		myMap.put("student c", 77);
		System.out.println(myMap.get("student a"));
		myMap.put("student a", 95);
		System.out.println(myMap.get("student a"));
		System.out.println(myMap.containsKey("student a"));
		System.out.println(myMap.containsKey("student d"));
		
		
		
	}

}
