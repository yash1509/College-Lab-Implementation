import java.io.*;
class stat
{
	static int a=30,b=20;
	stat()
	{
		a=a+b;
		System.out.println("Value of a is :"+a);
		a=a-2*b;
		System.out.println("Value of a is :"+a);
	}
}
class staticcheck
{
	public static void main(String args[])
	{	
		stat obj=new stat();
		System.out.println(" ");
		System.out.println(" ");
		stat obj1=new stat();
	}
}