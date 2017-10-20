package com.java.Static;
class StaticComponents
{
     static int staticVariable;
 
     static
     {
          System.out.println("StaticComponents SIB");
          staticVariable = 10;
     }
 
     static void staticMethod()
     {
          System.out.println("From StaticMethod");
          System.out.println(staticVariable);
     }
}
public class MainClassExample 
{
	//First MainClass Static Method Executed Later ABove Class Static Method Executed
    {
         System.out.println("MainClass SIB");
    }
	public static void main(String[] args) 
	{
		//Static Members directly accessed with Class Name
        StaticComponents.staticVariable = 20;
        StaticComponents.staticMethod();

	}

}
