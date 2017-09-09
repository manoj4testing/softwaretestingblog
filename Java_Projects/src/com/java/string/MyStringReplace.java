package com.java.string;

public class MyStringReplace {

	public static void main(String[] args) 
	{
		String str = "This is an example string";
        System.out.println("Replace char 's' with 'o':"
                    +str.replace('s', 'o'));
                     
        System.out.println("Replace first occurance of string\"is\" with \"ui\":"
                    +str.replaceFirst("is", "ui"));
                     
        System.out.println("Replacing \"is\" every where with \"no\":"
                    +str.replaceAll("is", "no"));

	}

}
