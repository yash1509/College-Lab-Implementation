import java.io.*;
class str1
{
	public static void main (String args[])throws IOException
	{	String s;
		System.out.println("Please enter a string");
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		s=String.parseString(obj.readLine());
		if(s.equals(new StringBuilder(s).reverse().toString())) 
			System.out.println("Palindrome");
	}
}