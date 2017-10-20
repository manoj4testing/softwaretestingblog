package com.java.PGM_friends;

public class Stud 
{
	Student1 st [];
	int stud_mark;
	String stud_name;
	double per;
	Stud(int stud_mark,String stud_name)
	{
		this.stud_mark=stud_mark;
		this.stud_name=stud_name;
	}
	void percentage()
	{
		for(int i=0;i<st.length;i++) 
		{
			per = (stud_mark/300)*100;
			System.out.println(" secured "+per+" marks.");		
		}
	}
}
