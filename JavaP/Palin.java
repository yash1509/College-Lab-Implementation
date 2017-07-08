import java.io.*;
class Palin
{
	public static void main(String args[])throws IOException
	{
		System.out.print("Enter a number to check for palindrome nature");
		int n; int a=0; int r=0;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		n=Integer.parseInt(obj.readLine());
		a=n;
		while(n!=0)
		{
			r=r*10;
			r=r+n%10;
			n=n/10;
		}
		if(a==r)
		{	
			System.out.println("The number shows palindrome nature");
		}
		else 
		{
			System.out.println("The number doesnt show palindrome nature");
		}
	}
}
			
		
		