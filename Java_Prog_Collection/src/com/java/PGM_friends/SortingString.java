package com.java.PGM_friends;

public class SortingString {

	public static void main(String[] args) {
		String st = "xkdvast";
		char temp;
		int j;
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for ( j= 0; j < ch.length; j++) {
				if (ch[j]>ch[i]) 
				{
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}				
			}	
		}
		for (int k = 0; k < ch.length; k++) {
			System.out.println(ch[k]);
		}
	}
}