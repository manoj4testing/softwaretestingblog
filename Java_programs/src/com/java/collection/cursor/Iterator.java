package com.java.collection.cursor;
import java.util.*;

public class Iterator
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{	
		ArrayList al=new ArrayList();
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		java.util.Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Integer n=(Integer)itr.next();
			if(n%2!=0)
			{
				System.out.println("Odd numbar:-"+n);
			}
		}
		System.out.println(al);
	}

}
