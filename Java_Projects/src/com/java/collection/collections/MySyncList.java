package com.java.collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySyncList {

	public static void main(String[] args) 
	{
		List<String> li = new ArrayList<String>();
		@SuppressWarnings("unused")
		List<String> sysLi = Collections.synchronizedList(li);
		System.out.println("Synchronized list got created...");

	}

}
