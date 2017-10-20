package com.java.basics;
class AB
{
    static
    {
        System.out.println("THIRD");
    }
}
 
class BC extends AB
{
    static
    {
        System.out.println("SECOND");
    }
}
 
class CD extends BC
{
    static
    {
        System.out.println("FIRST");
    }
}
public class StaticBlockExecution 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		CD obj=new CD();

	}

}
