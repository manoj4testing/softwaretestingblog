package com.java.basics;
class A
{
	{
        System.out.println(1);
	}
}
 
class B extends A
{
    {
        System.out.println(2);
    }
}
 
class C extends B
{
    {
        System.out.println(3);
    }
}
public class WithoutExample {

	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		C obj=new C();

	}

}
