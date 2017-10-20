package com.java.PGM_friends;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {
		String str = "Sep 17 2013";
		Date date = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH).parse(str);
		System.out.println(date);

	}

}
