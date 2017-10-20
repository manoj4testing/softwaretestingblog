package com.java.basics;

public class ThisUse 
{
public ThisUse() {
	// TODO Auto-generated constructor stub
}
	int a,b;
	ThisUse(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("The Value Of a: " + a);
		System.out.println("The Value Of b: " + b);
	}
	public int disp(){
		System.out.println(a);
		System.out.println(b);
		return 1;
	}

	

}
