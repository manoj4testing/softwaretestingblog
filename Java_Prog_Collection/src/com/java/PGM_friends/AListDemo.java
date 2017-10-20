package com.java.PGM_friends;

import java.util.ArrayList;
import java.util.Vector;

public class AListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list.size());
		for (int i = 0; i < 19; i++) {
			list.add(i);
		}
		System.out.println(list.size());
		/*Vector v = new Vector();
		System.out.println(v.capacity());
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());*/
		
	}

}
