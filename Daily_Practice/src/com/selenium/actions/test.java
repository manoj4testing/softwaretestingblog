package com.selenium.actions;
public class test {

	public static void main(String[] args) throws InterruptedException 
	{
		String S = "Folloowwwuupp";
		int L = S.length();
		char[] CH = S.toCharArray();
		for (int i=0; i<L; i++)
		{
			for (int j=i+1; j<L; j++)
			{
				if(CH[i] == CH[j])
				{
					System.out.println(CH[j]);
				}
			}
		}
	}
}