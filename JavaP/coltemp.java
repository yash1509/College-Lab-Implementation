import java.io.*;
class college
{	
	void getname()
	{
		System.out.println("college1 accessed");
	}
	void pric()
	{
		System.out.println("college2 accessed");
	}
	void nos()
	{
		System.out.println("college 3 accessed");
	}
}	

class course extends college
{
	void getcourse()
	{
		System.out.println("COURSE accessed");
	}
}

class Department extends college
{	
	
	void getdep()
	{	System.out.println("DEPARTMENT accessed");
		
	}
}
class student extends college
{
	void stud()
	{ System.out.println("student accessed");}
}


class coltemp
{
	public static void main(String args[])throws IOException
	{
		course obj1=new course();
		Department obj2=new Department();
		student obj3=new student();
		obj1.getcourse();
		obj1.getname();
		obj2.getdep();
		obj2.pric();
		obj3.stud();
		obj3.nos();
		
	}
}