package com.java.interviewPrograms;
public class Demo111 
{ 
	int rollno;  
	String name;  
	static String college ="ITS";  

	Demo111(int r,String n)
	{  
		rollno = r;  
		name = n;  
	}  
	void display ()
	{
		System.out.println(rollno+" "+name+" "+college);
	}  
	public static void main(String args[])
	{  
		Demo111 s1 = new Demo111(111,"Monoj");  
		Demo111 s2 = new Demo111(222,"Sourva");  

		s1.display();  
		s2.display();  
	}  
} 

