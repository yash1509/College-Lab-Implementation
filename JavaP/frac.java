import java.io.*;
class frac
{
	public static void main (String args[])throws IOException
	{
		System.out.println("Please enter a numbers");
		float a; int b; float c;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));	
		a=Float.parseFloat(obj.readLine());
		b=(int) a;
		c=a-b;
		System.out.println("The fractional part of number takes by user is :");
		System.out.println(c);
	}
}