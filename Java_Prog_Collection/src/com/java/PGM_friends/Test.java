package com.java.PGM_friends;

import java.util.*;


public class Test 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> l1=new ArrayList<Employee>();
		l1.add(new Employee(12,"ada",212.50));
		System.out.println(l1.get(0));;
		//l1.add("B");
		//l1.add("C");
		int i = l1.indexOf(l1);
		System.out.println(i);
		System.out.println(l1);
		Iterator<Employee> it = l1.iterator();
		while(it.hasNext()){
			Employee e = it.next();
			System.out.println(e);
		}
		Vector v = new Vector();
		v.add(l1);
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
}
