import java.io.*;
class college
{	int k=0; double b; String s1;
	college( int i)
	{	
		this.k=i;
	}
	
	college(String s)
	{	
		
		this.s1=s;
	}

	college(double a, double t)
	{	
		this.b=a+t;
	} 	
	
}	

class course extends college
{
	course(int y)
	{ super(y);}
	void cou()
	{
	System.out.println("There are k students in the course:"+k);
	}
}

class Department extends college
{	
	
	Department(String p1)
	{ 
		super(p1);
	}
	void pri()
	{
	System.out.println("The department is   "+s1);
	}
}
class student extends college
{
	student(double o,double p)
	{
		super(o, p);
	}
	void stud()
	{
		System.out.println("Sum is"+b);
	}	
}

class collovsup
{
	public static void main(String args[])throws IOException
	{
		course obj1=new course(5);
		String t="computer science";
		Department obj2=new Department(t);
		student obj3=new student(5.1,6.2);
		obj1.cou();
		obj2.pri();
		obj3.stud();
		
	}
}