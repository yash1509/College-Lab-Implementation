import java.io.*;
class A
{
	void show1()
	{
		System.out.println("Hello");
	}
}
class B extends A
{
	void show1()
	{
		System.out.println("Hi");
	}
}
class obj
{
	public static void main(String args[])
	{
		A ob=(A)new B();
		ob.show1(); 
	}
}