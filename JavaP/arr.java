import java.io.*;
class arr
{
	public static void main (String args[])throws IOException
	{
		System.out.println("Please enter the size of array");
		int arr[]=new int[32];
		int i,n,j;
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		n=Integer.parseInt(obj.readLine());
		System.out.println("Please enter the elements of array");
		for(i=0;i<n;i++)
		arr[i]=Integer.parseInt(obj.readLine());
		
		for(i=0;i<n;i++)
		{
			if (arr[i]>arr[i+1])
			{
				System.out.println("Not a sorted array");
				break;
			}	
			
		}
		int temp;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
		{
			if (arr[j]>arr[j+1])
			{
			 temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			}
		}
		i++;
		System.out.println("The sorted array is:");
		for(i=1;i<=n;i++)
		System.out.println(arr[i]);
		
		
	}
}