package com.java.Hashcode;

public class HashcodeEx {

	public static void main(String[] args) 
	{
		HashcodeEx obj=new HashcodeEx();
		HashcodeEx obj1=obj;
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());

	}

}
