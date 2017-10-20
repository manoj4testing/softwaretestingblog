package com.java.PGM_friends;

import java.util.Set;
import java.util.TreeSet;

class B implements Cloneable
{
	public Object f() throws CloneNotSupportedException
	{
		return super.clone();
	}
}


public class TreeSetDemo {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
	
		
		B obj=new B();
		
		B obj1=(B) obj.f();
		System.out.println(obj.hashCode()+"  "+obj1.hashCode());
		
	
	}
}