import java.io.*;
class money1
{
	public static void main(String args[])throws IOException
	{	
		float Rs1, p1; int n;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the amount of Rupees");
		Rs1=Float.parseFloat(obj.readLine());
		System.out.println("Enter the amount of paisa");
		p1=Float.parseFloat(obj.readLine());
		moneydemo obj1=new moneydemo();
		System.out.println("Enter the choice for calculation of money");
		System.out.println("1)Addition");
		System.out.println("2)Subtraction");
		n=Integer.parseInt(obj.readLine());
		if(n==1)
		{ obj1.add(Rs1,p1); System.exit(0); }
		if(n==2)
		{ obj1.sub(Rs1,p1); System.exit(0); }
		else 
		System.out.println("Wrong choice.");	
		
	}
}

class moneydemo 
{

	void add(float Rs,float p)
	{
		float sum=0,c=0,rs=0;
		c=p;
		if(c>=0&&c<=99)
		{
			c=p/100;
		}
		else
		{	
			c=p/100;
		}
		sum=Rs+c;
		System.out.println("The final amount is equals to, after addition of rupees and paise : "+sum);
	}	
	
	void sub(float Rs,float p)
	{
		float sub1=0,c=0,rs=0;
		c=p;
		if(c>=0&&c<=99)
		{
			c=p/100;
		}
		else
		{
			c=p/100;
		}
		sub1=Rs-c;
		System.out.println("The final amount is equals to, after subtraction of rupees and paise : "+sub1);
	}	
}

	
	