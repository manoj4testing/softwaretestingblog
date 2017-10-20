package com.java.basics;

public class BkProg1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		boolean x=true;
		bl1:
		{
			bl2:
			{
			bl3:
			{
			if(x)  break bl2;
			System.out.println("Block3");
			}//End of bl3
		System.out.println("Block2");
			}//End of bl2
		System.out.println("Block1");
		}//End of bl1
		System.out.println("Out of all blocks");

	}

}
