package com.java.PGM_friends;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveFromIterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(40);
		System.out.println(list);
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			
			System.out.println(i);
			it.remove();
			System.out.println("-------");
			System.out.println("-------");
			System.out.println(i);
			System.out.println("-------");
		}
		System.out.println(list);
	}
}