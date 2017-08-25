package com.selenium.mix;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		File f=new File("G:\\Daily Practice\\Practice\\src\\review\\Selenium Text");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hi Manoj");
		bw.newLine();
		bw.write("Hi Guys");
		bw.close();
	}

}
