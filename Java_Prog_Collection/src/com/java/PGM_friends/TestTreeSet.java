package com.java.PGM_friends;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(10);
		set.add("asd");
		System.out.println(set);
		
		TreeMap map = new TreeMap();
		map.put(1,"asd");
		map.put(2,22);
		map.put(3,50.36);
		System.out.println(map);
	}
}