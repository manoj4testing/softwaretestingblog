package com.java.basics;

public class WideiningExample {

	public static void main(String[] args) 
	{
		//Conversion lower ro higher is called wideining
		//byte->short->int->float->long->double
		int i = 100; 
        
        //automatic type conversion
        long l = i; 
         
        //automatic type conversion
        float f = l; 
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);

	}

}
