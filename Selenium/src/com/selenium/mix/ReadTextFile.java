package com.selenium.mix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("G:\\Daily Practice\\Practice\\src\\review\\Selenium Text");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String x=br.readLine();
		while(x!=null)
		{
			System.out.println(x);
			x=br.readLine();
		}
		
		
}

}
