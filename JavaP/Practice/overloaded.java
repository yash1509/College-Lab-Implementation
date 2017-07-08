import java.io.*;
class overload
{	int a,b,c,d;
	overload(int a)
	{
		a++;
		System.out.println(a);
	}
	overload(int a,int b)
	{
		c=a+b;
		System.out.println(c);
	}
	overload(int a,int b,int c)
	{
		d=a+b+c;
		System.out.println(d);
	}
}

class overloaded
{
	public static void main(String args[])throws IOException
	{
		overload obj=new overload(1);
		overload obj1=new overload(1,2);
		overload obj2=new overload(1,2,3);
	}
}
		
		