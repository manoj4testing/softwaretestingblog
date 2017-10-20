package co.java.exception;

public class ClassCastException {

	public static void main(String[] args) 
	{
		Object obj=new Object();
		int i=(int) obj;
		System.out.println(i);

	}

}
