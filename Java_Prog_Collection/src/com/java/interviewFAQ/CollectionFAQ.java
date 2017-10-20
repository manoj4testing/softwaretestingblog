package com.java.interviewFAQ;

import java.util.HashMap;

public class CollectionFAQ {

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		/*for(int i=0;i=3;i++)
		{
			System.out.println();
		}*/
		
		@SuppressWarnings("rawtypes")
		HashMap mp=new HashMap();
		mp.put("a", new Integer(1));
		mp.put("b", new Integer(2));
		System.out.println(mp);

	}

}
