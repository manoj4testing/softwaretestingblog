package co.java.exception;

public class ArithmaticExceptionEx {

	void divide(int a,int b)
	{
		int q=a/b;
		System.out.println("Sucessfully Divided");
		System.out.println("The Value After Divide Is :-" +q);
	}
	public static void main(String[] args) 
	{
		ArithmaticExceptionEx obj=new ArithmaticExceptionEx();
		obj.divide(10, 0);

	}

}
