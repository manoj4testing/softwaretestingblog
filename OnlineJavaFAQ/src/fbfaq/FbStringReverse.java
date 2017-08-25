package fbfaq;

public class FbStringReverse {

	public static void main(String[] args) 
	{
		/*write a java code for given string 
		"I Live in India"
		output= "I eviL in India"*/
		
		String s= "I Live in India";
		String[] v = s.split(" ");
		v[1]=new StringBuffer(v[1]).reverse().toString();
		for(String s1:v)
		System.out.print(s1+" ");

	}

}
