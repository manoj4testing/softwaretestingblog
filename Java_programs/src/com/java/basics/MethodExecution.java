
package com.java.basics;
class AA
{
    public AA()
    {
        System.out.println("Class A Constructor");
    }
}
 
class BB extends AA
{
    public BB()
    {
        System.out.println("Class B Constructor");
    }
}
 
class CC extends BB
{
    public CC()
    {
        System.out.println("Class C Constructor");
    }
}
public class MethodExecution {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		CC Obj=new CC();
	}

}
