import java.io.*;
class New
{
	public static void main(String args[])
	{	
		System.out.print("Enter the year to check for leap year");
		int a;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		a=Integer.parseInt(obj.readLine());
		if(a%4==0||a%400==0&&a%100!=0)
			System.out.println("It is a leap year");
	}
}