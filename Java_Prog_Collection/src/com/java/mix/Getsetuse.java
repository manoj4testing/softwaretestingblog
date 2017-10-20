package com.java.mix;

public class Getsetuse 
{
	private int a;
	public int getA() 
	{
		return a;
	}

	public void setA(int a) 
	{
		this.a = a;
	}

	public int getB() 
	{
		return b;
	}

	public void setB(int b) 
	{
		this.b = b;
	}

	private int b;

	public static void main(String[] args) 
	{
		
		Getsetuse obj=new Getsetuse();
		obj.setA(10);
		obj.setB(25);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		
	}

}
