package com.java.equalsex;

public class InstanceOfEx {

	public static void main(String[] args) 
	{
		InstanceOfEx obj=new InstanceOfEx();
		if(obj instanceof InstanceOfEx)
		{
			System.out.println("Object Belongs to That Class");
		}
		else
		{
			System.out.println("Object No Belongs to That Class");
		}

	}

}
