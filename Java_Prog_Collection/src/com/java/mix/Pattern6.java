package com.java.mix;

public class Pattern6 {

	public static void main(String[] args) 
	{
		int i, j, num;
        for(i=0; i<5; i++)
        {
            num=1;
            for(j=0; j<=i; j++)
            {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }

	}

}
