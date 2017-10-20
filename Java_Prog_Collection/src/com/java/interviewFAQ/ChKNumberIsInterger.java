package com.java.interviewFAQ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChKNumberIsInterger {

	public static void main(String[] args) 
	{
		String input = "";
        BufferedReader br    = new BufferedReader(new InputStreamReader (System.in));

        System.out.println("Enter A Value: ");
        try 
        {
            input = br.readLine();
            Integer.parseInt(input);
            System.out.println("Entered Input Is Integer Value");
        } 
        catch (Exception E) 
        {
            System.out.println("Enter a Integer Value");
        }
        
	}

}
