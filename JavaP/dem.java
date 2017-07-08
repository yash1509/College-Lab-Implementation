import java.io.*;
class calc
{
	void addition(int n,int l)
	{
		int r=n+l;
		System.out.println("Addition is:"+r);
	}
	void addition(Float n,Float l)
	{
		Float r=n+l;
		System.out.println("Addition is:"+r);
	}
	void addition(Double n,Double l)
	{
		Double r=n+l;
		System.out.println("Addition is:"+r);
	}
	void addition(Long n,Long l)
	{
		Long r=n+l;
		System.out.println("Addition is:"+r);
	}
	void subtraction(int n,int l)
	{
		int r=n-l;
		System.out.println("Subtraction is:"+r);
	}
	void subtraction(Float n,Float l)
	{
		Float r=n-l;
		System.out.println("Subtraction is:"+r);
	}
	void subtraction(Double n,Double l)
	{
		Double r=n-l;
		System.out.println("Subtraction is:"+r);
	}
	void subtraction(long n,long l)
	{
		Long r=n-l;
		System.out.println("Subtraction is:"+r);
	}
	void multiplication(int n,int l)
	{
		int r=n*l;
		System.out.println("Multiplication is:"+r);
	}
	void multiplication(long n,long l)
	{
		long r=n*l;
		System.out.println("Multiplication is:"+r);
	}
	void multiplication(Double n,Double l)
	{
		Double r=n*l;
		System.out.println("Multiplication is:"+r);
	}
	void multiplication(Float n,Float l)
	{
		Float r=n*l;
		System.out.println("Multiplication is:"+r);
	}
	void division(int n,int l)
	{
		int r=n/l;
		System.out.println("Division is:"+r);
	}
	void division(Float n,Float l)
	{
		Float r=n/l;
		System.out.println("Division is:"+r);
	}
	void division(Long n,Long l)
	{
		Long r=n/l;
		System.out.println("Division is:"+r);
	}
	void division(Double n,Double l)
	{
		Double r=n/l;
		System.out.println("Division is:"+r);
	}
				
}	

class dem
{
	public static void main (String args[])throws IOException
	{	
		calc obj1=new calc();
		obj1.addition(2,5);
		obj1.addition(2.00005,5.232);
		obj1.subtraction(2.00005,5.232);
		obj1.subtraction(2,5);
		obj1.division(4,2);
		obj1.division(2.34567890,1.09876542);
		obj1.multiplication(5,6);
		obj1.multiplication(4.3294,3.5);
	}
}
		