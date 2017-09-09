package co.java.exception;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundException {

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		try
		{
			 
            // Following file does not exist
            File file = new File("E://file.txt");
 
            @SuppressWarnings("resource")
			FileReader fr = new FileReader(file);
        }
		catch (java.io.FileNotFoundException e)
		{
           System.out.println("File does not exist");
        }

	}

}
