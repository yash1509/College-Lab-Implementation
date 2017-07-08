import java.io.*;
class second
{
	public static void main (String args[])throws IOException
	{
		System.out.println("Please enter the size of array");
		int a[]=new int[32];
		int i,n,j;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		n=Integer.parseInt(obj.readLine());
		System.out.println("Please enter the elements of array");
		for(i=0;i<n;i++)
		a[i]=Integer.parseInt(obj.readLine());
		
		int t,s1;
		t=a[0];
		s1=a[0];
		
		for(i=0;i<n;i++)
		{	if(a[i]>t)
				t=a[i];
		}
		int c=0;
		for(i=0;i<n;i++)
		{	if ((a[i]>s1)&&(a[i]<t))
				c=a[i];
		}
		System.out.println("The second largest number is");
		System.out.println(c);
	}
}