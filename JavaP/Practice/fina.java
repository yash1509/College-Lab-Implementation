import java.io.*;

class fina1
{	final int x=3; 
	final void display()
	{
		System.out.println("This will not be executed");
	};
	
}

class fina2 extends fina1
{
	void display()
	{
		System.out.println("This will not be executed");
	}
}

class fina
{
	public static void main(String args[])
	{
		fina2 obj=new fina2();
		obj.display();
	}
}
