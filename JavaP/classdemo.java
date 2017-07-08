import java.io.*;
class calc
{	int r,s,t,u;
	void addition(int n,int l)
	{
		r=n+l;
		System.out.println(r);
	}
	void addition(Float n,Float l)
	{
		r=n+l;
		System.out.println(r);
	}
	void addition(Double n,Double l)
	{
		r=n+l;
		System.out.println(r);
	}
	void addition(Long n,Long l)
	{
		r=n+l;
		System.out.println(r);
	}
	void subtraction(int n,int l)
	{
		r=n-l;
		System.out.println(r);
	}
	void subtraction(Float n,Float l)
	{
		r=n-l;
		System.out.println(r);
	}
	void subtraction(Double n,Double l)
	{
		r=n-l;
		System.out.println(r);
	}
	void subtraction(long n,long l)
	{
		r=n-l;
		System.out.println(r);
	}
	void multiplication(int n,int l)
	{
		r=n*l;
		System.out.println(r);
	}
	void multiplication(long n,long l)
	{
		r=n*l;
		System.out.println(r);
	}
	void multiplication(Double n,Double l)
	{
		r=n*l;
		System.out.println(r);
	}
	void multiplication(Float n,Float l)
	{
		r=n*l;
		System.out.println(r);
	}
	void division(int n,int l)
	{
		r=n/l;
		System.out.println(r);
	}
	void division(Float n,Float l)
	{
		r=n/l;
		System.out.println(r);
	}
	void division(Long n,Long l)
	{
		r=n/l;
		System.out.println(r);
	}
	void division(Double n,Double l)
	{
		r=n/l;
		System.out.println(r);
	}
				
}	

class calcdemo 
{
	public static void main (String args[])throws IOException
	{
		System.out.println("Enter two numbers for calculation");
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		int n,l;
		n=Integer.parseInt(obj.readLine());
		l=Integer.parseInt(obj.readLine());
		n=Float.parseFloat(obj.readLine());
		
	}
}
		