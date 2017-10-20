package com.java.PGM_friends;
class Sample
{
	void show()
	{
		System.out.println("Method of Sample class.");
	}
}
class Sample1
{
	static Sample s = new Sample();
	void disp()
	{
		System.out.println("Method of Sample1 class.");
	}
}
public class New2 
{
	public static void main(String[] args) 
	{
		Sample1.s.show();
	}
}
