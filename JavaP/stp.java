import java.io.*;
class stp
{
	public static void main (String args[])throws IOException
	{	String s;
		BufferedReader obj=new BufferedReader(new InputStreamReader (System.in));
		s=(obj.readLine());
		StringBuffer ob1=new StringBuffer(s);
		ob1.reverse();
		String temp;
		temp=s;
		s=ob1.toString();
		if(temp.equals(s))
		System.out.println("Palindrome");
		else
		System.out.println("Not a Palindrome");
	}
}