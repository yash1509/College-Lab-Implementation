import java.io.*;
class lim
{	
		int a,b; int c;
	
		void dis()
		{	System.out.println("Dis is:");
			System.out.println(a);
			System.out.println(b);
		}

		void add()
		{	System.out.println("This is executed");
			System.out.println(a);
			System.out.println(b);
			c=a+b;
			System.out.println(c);
		}
		
	void disp()
	{	System.out.println("Value of c disp is:");
		c=a+b;
		System.out.println(c);
	}
	
		void display()
		{
			lim obj3=new lim();
			obj3.add();
			System.out.println("Value of c display is:");
			System.out.println(c);
		}
}
class limtest
{
	public static void main(String args[])
	{
		lim obj1=new lim();
		obj1.a=5;
		obj1.b=6;
		obj1.dis();

		obj1.disp();
		obj1.display();
	}
}