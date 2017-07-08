import java.io.*;
class A
{	
		private 
			int a=10;
			int b=20;
			int c;
			void add()
			{
				c=a+b;
				System.out.println(c);
			}
		protected
			int d=50;
		public
			void display()
			{
				add();
				int z=d+c;
				System.out.println(z);
			}
}

class B extends A
{
		private
		int m;
		protected
		int n=m+d;
		public
		void disp1(int x)
		{
			m=x;
			System.out.println(n);
		}
}
class C
{
	
	public static void main (String args[])throws IOException
	{
		A ob=new A();
		ob.d=50;
		ob.display();
		B ob1=new B();
		ob1.d=80;
		ob1.disp1(10);
		ob1.display();
	}
}