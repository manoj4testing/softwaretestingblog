package com.java.mix;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToStringArray {

	public static void main(String[] args) 
	{
		//ArrayList containing string objects
        ArrayList<String> aListDays = new ArrayList<String>();
        aListDays.add("Sunday");
        aListDays.add("Monday");
        aListDays.add("Tuesday");
       
        /*
         * To convert ArrayList containing String elements to String array, use
         * Object[] toArray() method of ArrayList class.
         *
         * Please note that toArray method returns Object array, not String array.
         */
       
        //First Step: convert ArrayList to an Object array.
        Object[] objDays = aListDays.toArray();
       
        //Second Step: convert Object array to String array
        String[] strDays = Arrays.copyOf(objDays, objDays.length, String[].class);
       
        System.out.println("ArrayList converted to String array");
       
        //print elements of String array
        for(int i=0; i < strDays.length; i++){
                System.out.println(strDays[i]);
        }

	}

}
