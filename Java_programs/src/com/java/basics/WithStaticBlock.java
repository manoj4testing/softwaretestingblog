package com.java.basics;
class X
{
    static void staticMethod()
    {
        System.out.println("Class X");
    }
}
 
class Y extends X
{
    static void staticMethod()
    {
        System.out.println("Class Y");
    }
}
public class WithStaticBlock 
{

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		Y.staticMethod(); // Y Class Methods Prints
		
		X obj=new Y();
		obj.staticMethod();// Super Class Method Executed That Is Called data Hiding
		
		Y obj1=new Y();
		obj1.staticMethod();

	}

}
