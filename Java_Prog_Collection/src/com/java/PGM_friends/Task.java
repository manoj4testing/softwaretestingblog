package com.java.PGM_friends;


import java.util.*;

public class Task {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("list");
		list.add("z");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("list");
		
		System.out.println(list);
		
		Set<String> set = new HashSet<String>();
		set.add("tree");
		set.addAll(list);
		System.out.println(set);
		
		//list.add(set);
		//System.out.println(list);
	}
}
