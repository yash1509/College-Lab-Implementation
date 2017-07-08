import java.io.*;
	
class moneydemo 
{	
	
	void add(float Rs,float p)
	{
		float rs=0,c=0,sum=0;
		p=p/100;
		c=p;
		if(c>=0&&c<=99)
			{p=c; p=p/100;}
		else
		{ 	rs=p/100;		
			p=0;
		}
		sum=p+Rs+rs;
		System.out.println("The sum is : "+sum);
	}
	void sub(float Rs,float p)
	{
		float rs=0,c=0,sub=0;
		c=p;
		if(c>=0&&c<=99)
			{p=c; p=p/100;}
		else
		{ 	rs=p/100;		
			p=0;
		}
		sub=Rs-rs-p;
		System.out.println("The subtraction of the amount is : "+sub);
		
	}
}	
		
class money
{
	public static void main(String args[])throws IOException
	{	
		float Rs1, p1;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the amount of Rupees");
		Rs1=Float.parseFloat(obj.readLine());
		System.out.println("Enter the amount of paisa");
		p1=Float.parseFloat(obj.readLine());
		moneydemo obj1=new moneydemo();
		moneydemo obj2=new moneydemo();
		obj1.add(Rs1,p1);
		
		obj2.sub(Rs1,p1);
		
		
	}
}

		


	

		