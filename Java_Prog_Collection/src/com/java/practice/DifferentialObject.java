package com.java.practice;
class top
{
	int b=20;
	void m1()
	{
		System.out.println("Inside Super Class");
	}
}
public class DifferentialObject {

	public static void main(String[] args) 
	{
		new top();
		new top().b=30;
		//System.out.println(b); //Differential Objects Can't be Outside
		top obj=new top();
		obj.b=30;
		System.out.println(obj.b);
		
		
		

	}

}
