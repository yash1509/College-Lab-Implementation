import java.io.*;
class sal
{
	public static void main (String args[])throws IOException
	{
		System.out.println("Please enter your salary");
		Double a;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		a=Double.parseDouble(obj.readLine());
		Double gs,da,hra;
		da=.2*a;
		hra=.8*a;
		gs=a+da+hra;
		
		System.out.println("The gross salary is :");
		
		System.out.println(gs);
	}
}		
		