package com.java.mix;

public class Prog1 {
	int x=10;
	static int y=20;

	public static void main(String[] args) 
	{
		Prog1 obj1=new Prog1();
		obj1.x=888;
		obj1.y=999;
		Prog1 obj2=new Prog1();
		System.out.println(obj2.x+"-----"+obj2.y);
		
	}

}
