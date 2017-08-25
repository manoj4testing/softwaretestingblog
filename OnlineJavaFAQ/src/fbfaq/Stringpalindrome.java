package fbfaq;

public class Stringpalindrome {

	public static void main(String[] args) 
	{
		
		String s= "watch this watch";
		System.out.println("Before Swap"+s);
		String[] v = s.split(" ");
		for(int i=v.length-1;i>=0;i--)
		{
		System.out.print(v[i]+" ");
		}

	}

}
