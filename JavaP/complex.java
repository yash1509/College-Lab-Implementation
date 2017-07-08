import java.io.*;
class complex
{
	public static void main(String args[])throws IOException
	{	
		int k;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Choose an option for calculation on complex number:");
		System.out.println("1) Addition");
		System.out.println("2) Subtraction");
		k=Integer.parseInt(obj.readLine());
		comp obj4=new comp();
		obj4.opt(k);
		
		
			
	}
}

class comp
{
	float m,l,o,y; int n;
	void opt(int k)throws IOException
		{
			n=k;
			if(n==1)
			{	
				BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
				System.out.println("Please enter the real and imaginary part of first complex number");
				m=Float.parseFloat(obj.readLine());
				l=Float.parseFloat(obj.readLine());
				System.out.println("Please enter the real and imaginary part of second complex number");
				o=Float.parseFloat(obj.readLine());
				y=Float.parseFloat(obj.readLine());
				add(m,l,o,y);
			}
			if(n==2)
			{	
				BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
				System.out.println("Please enter the real and imaginary part of first complex number");
				m=Float.parseFloat(obj.readLine());
				l=Float.parseFloat(obj.readLine());
				System.out.println("Please enter the real and imaginary part of second complex number");
				o=Float.parseFloat(obj.readLine());
				y=Float.parseFloat(obj.readLine());
				sub(m,l,o,y);
			}
		}
	void add(float a,float b,float c,float d)
	{	float t1=0,t2=0,t3=0,t4=0;
		if(b==0||d==0)
		{	System.out.println("Check your inputs again as there's one or more real number entered");}
		else	
		{
			t1=a+c;
			t2=b+d;
			System.out.println("The addition of complex numbers entered is "+t1+"+i"+t2);
		}
	}
			 
	void sub(float a,float b,float c,float d)
	{	float t1=0,t2=0,t3=0,t4=0;
		if(b==0||d==0)
		{	System.out.println("Check your inputs again as there's one or more real number entered");}
		else	
		{
			t1=a-c;
			t2=b-d;
			System.out.println("The addition of complex numbers entered is "+t1+"+i"+t2);
		}
	}
}			
		
		
			 