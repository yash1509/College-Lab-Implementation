import java.io.*;
class binary
{
	public static void main(String args[])throws IOException
	{
		int i,j,m,s,e,n,key,fl=0;
		System.out.println("Enter the size of array:");
		int a[]=new int[20];
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		n=Integer.parseInt(obj.readLine());
		System.out.println("Enter the elements of array:");
		for(i=0;i<n;i++)
			a[i]=Integer.parseInt(obj.readLine());
		System.out.println("Enter the search element");
		key=Integer.parseInt(obj.readLine());
		s=0;
		e=n-1;
		m=s+e;
		while(m>0)
		{
			if(a[m]==key)
			{		System.out.println("The key element is at the index position :\t"+m);
					fl=1;
			}
			else {if(a[m]<key)
				{
					s=m+1;
				}
				else
				{
					e=m-1;
				}}
		m--;
		}
		if (fl==0)
			System.out.println("Element not present in the list");
	}
}
			
		