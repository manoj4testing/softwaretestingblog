package com.java.mix;

import java.util.Scanner;

public class AmaStrongNo {

	public static void main(String[] args) 
	{
		//371,153 is a armstrong number
		int n, nu, num=0, rem;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any Positive Number : ");
        n = scan.nextInt();
		
        nu = n;
		
        while(nu != 0)
        {
            rem = nu%10;
            num = num + rem*rem*rem;
            nu = nu/10;
        }
        if(num == n)
        {
            System.out.print("Armstrong Number"); //371
        }
        else
        {
            System.out.print("Not an Armstrong Number");
        }

	}

}
