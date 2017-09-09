package com.java.equalsex;

public class EqualsEx {

	public static void main(String[] args)
	{
		EqualsEx obj=new EqualsEx();
		EqualsEx obj1=new EqualsEx();
		boolean value=obj.equals(obj1);
		System.out.println("Value Is : -" + value);
		String m="Manoj";
		String k="Manoj";
		boolean result=m.equals(k);
		System.out.println("Matched is : -" +result);
	}

}
