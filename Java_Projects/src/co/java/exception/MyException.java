package co.java.exception;

@SuppressWarnings("serial")
public class MyException extends Exception 
{
	//not compulsory
	public MyException()
	{
		super();
		System.out.println("MyException");
	}
	public String getFaultMessage()
	{
		return "U r not an adult ....";
	}
}
