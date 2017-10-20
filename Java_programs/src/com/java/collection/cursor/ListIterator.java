package com.java.collection.cursor;
import java.util.LinkedList;
public class ListIterator
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Monoj");
		ll.add("Dusi");
		ll.add("Ram");
		ll.add("Rnjan");
		ll.add("Pawan");
		System.out.println(ll);
		java.util.ListIterator<String> litr=ll.listIterator();
		while(litr.hasNext())
		{
			String s1=(String)litr.next();
			if(s1.equals("Dusi"))
			{
				litr.remove();
			}
			else if(s1.equals("Ram"))
			{
				litr.add("charan");
			}
			else if(s1.equals("Pawan"))
			{
				litr.set("kalyan");
			}
				
		}
		System.out.println(ll);
	}
}
