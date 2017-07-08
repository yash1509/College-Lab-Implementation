import java.io.*;
class test
{
	public static void main (String args[])throws IOException
	{
		System.out.println("Please enter a number");
		byte m;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));	
		m=Byte.parseByte(obj.readLine());
		System.out.println("The number entered is:" +m);
	}
}