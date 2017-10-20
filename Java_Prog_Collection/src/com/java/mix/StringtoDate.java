package com.java.mix;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringtoDate {

	public static void main(String[] args) 
	{
		//Java String having date
		String strDate = "21/08/2011";

		/*
		 * To convert Java String to Date, use
		 * parse(String) method of SimpleDateFormat class.
		 *
		 * parse method returns the Java Date object.
		 */

		try
		{

			/*
			 * Create new object of SimpleDateFormat class using
			 * SimpleDateFormat(String pattern) constructor.
			 */

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			//convert Java String to Date using parse method of SimpleDateFormat
			Date date = sdf.parse(strDate);

			//Please note that parse method throws ParseException if the String date could not be parsed.

			System.out.println("Date is: " + date);

		}
		catch(ParseException e)
		{
			System.out.println("Java String could not be converted to Date: " + e);
		}

}

}
