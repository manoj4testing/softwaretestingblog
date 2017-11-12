package com.java.PGM_friends;

public class Student 
{
	String ar[] = {"ashu","amit","adi","aryan"};
	int mark;
	double per;
	Student(int mark, String string)
	{
		this.mark=mark;
	}
	void percentage()
	{
		int i;
		for( i=0;i<ar.length;i++) 
		{
			per = (mark/300.0)*100;
			System.out.println(ar[i]+" secured "+per+" marks.");
			
		}
		//System.out.println(ar[i]+" secured "+per+ "marks.");
	}
}
