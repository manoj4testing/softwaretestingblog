package com.selenium.advancedprograms;

public class Demo {

	int a=9; //it gives error bcoz non static can not accesed outside method
	public static void main(String[] args) throws InterruptedException 
	{
		/*WebDriver driver=new FirefoxDriver();
		driver.get("https://www.onlinesbi.com/");
*/
		/*Object o=new Integer(10);
		String s=(String)o;
		System.out.println(s);*/

		/*int a=10,b=20;
		System.out.println("Value Of a" + a + "Value Of b"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap" +"Value Of a" + a + "Value Of b"+b);*/
		
		/*String str="Manoj";
		char a[]=str.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}*/
		int a=9;
		System.out.println(a);
		
		Thread.sleep(2000); // throws interuppted exception
	}

}
