import java.io.*;
class prime1
{
	int i,j,c,count,temp;
	void prime(int n)
	{
		for(i=2;i<n;i++)
		{ temp=i;
			for(j=1;j<=i;j++)
			{	if(i%j==0)
				count++;
			}
			if(count<=2)
			{	c=temp;
				
				System.out.println(c+"\t");
			}
			count=0;
		}
		
		
	}
				
}	

class primedemo 
{
	public static void main (String args[])throws IOException
	{
		System.out.println("Enter the limit for prime no. generation");
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		int n;
		n=Integer.parseInt(obj.readLine());
		prime1 obj1=new prime1();
		
		obj1.prime(n);
	}
}
		