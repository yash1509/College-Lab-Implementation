import java.io.*;
class college
{	
	void getname() 
	{
		System.out.println("Manipal University Jaipur");	
	}
	int stud()
	{int r=540; int k=367;
		void getcss()
			{System.out.println("Number of students"+r);}
		void getits()
	
			{System.out.println("Number of students"+k);}
	return 0;
	}
	String address="Dehmi Kalan ,Tehsil Sanganer,Jaipur";
	
	
	
	
}
class course extends college
{	int n;
	BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
	void getcourses()throws IOException
	{	
		System.out.println("Courses offered are");
			System.out.println("1)Engineering");
				System.out.println("2)BJMC");
				System.out.println("Enter the choice of your course");
				n=Integer.parseInt(obj.readLine());
				/*if (n==1)
					
				if (n==2)*/
					
			
	}
}
class Department extends college
{	BufferedReader obj1=new BufferedReader (new InputStreamReader(System.in)); int n1;
	
	public void getdeng()throws IOException
	{
		System.out.println("The department consists of");
		System.out.println("1)Computer Science");
		System.out.println("2)Information and Technology");
		System.out.println("Enter the choice of your department");
		n1=Integer.parseInt(obj1.readLine());											
		/*if (n1==1)
				
		if (n1==2)*/
			
	}
	public void getbjmc()
	{
		System.out.println("Mass media rocks!");
		
	} 
}

class student extends college
{	void stud1()
	{
		System.out.println("Checking");
	}
}

class coll
{	
	public static void main(String args[])throws IOException
	{	
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		course obj60=new course();
		Department obj40=new Department();
		student obj30=new student();
		obj60.getname();
		obj30.stud();
		
		
	}
}

