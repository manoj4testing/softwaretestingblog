package com.java.PGM_friends;

import java.util.*;

public class First 
{
	public static void main(String[] args) 
	{
		ArrayList al1 = new ArrayList();
		al1.add("Ashu");
		al1.add("Abc");
		al1.add("23");
		al1.add(null);
		al1.add(2,"Ashu");
		al1.add(new Student(101,"Bbsr"));
		System.out.println(al1);
		System.out.println(al1.size());
		ArrayList al2 = new ArrayList();
		al2.add("msg");
		al2.add("sms");
		System.out.println("---------------------------");
		al2.addAll(al1);//addAll
		System.out.println(al2);
		System.out.println(al2.size());
		System.out.println("---------------------------");
		Object ob1 = al1.remove(0);//remove
		System.out.println(ob1);
		System.out.println("---------------------------");
		int i = al2.indexOf("Ashu");//indexOf
		System.out.println(i);
		System.out.println("---------------------------");
		int i1 = al2.lastIndexOf("Ashu");//lastIndexOf
		System.out.println(i1);
		System.out.println("---------------------------");
		Object ob = al1.get(3);//get
		System.out.println(ob);
		System.out.println("---------------------------");
		Iterator it = al1.iterator();//iterator
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("---------------------------");
		for(Object o:al1)//for each for collection
		{
			System.out.println(o);
		}
		System.out.println("---------------------------");
		boolean b = al2.contains(al1);//List
		System.out.println(b);
		System.out.println("---------------------------");
		al1.retainAll(al2);//List
		System.out.println(al1);
		Object ob3 = al1.set(4,"Java");
		System.out.println(ob3);
		List l1 = al1.subList(1,3);
		System.out.println(l1);
		Object ob4 = al1.clone();
		System.out.println(ob4);
	}
}
