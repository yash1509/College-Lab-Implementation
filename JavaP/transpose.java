import java.io.*;
class transpose
{
	public static void main (String args[])throws IOException
	{	
		int m,n,i,j,flag=0;
		System.out.println("Enter the size of array");
		BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
		m=Integer.parseInt(obj.readLine());
		n=Integer.parseInt(obj.readLine());
		System.out.println("Enter the elements of array");
		int arr[][]=new int[20][20];
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				arr[i][j]=Integer.parseInt(obj.readLine());
		System.out.println("Checking if the matrix enetered is transpose or not:");
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				if(arr[i][j]==arr[j][i])
					flag++;
				
					
		if(flag<n*m)
			System.out.println("The entered matrix is not equal to its transpose.");		
		else
			{System.out.println("The entered matrix is equal to its transpose ie Symmetric.");
					System.exit(0);}
							
		
		int b[][]= new int[20][20];
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				b[j][i]=arr[i][j];
		System.out.println("The transpose of the matrix is:");
		for(i=0;i<n;i++)	
			{for(j=0;j<m;j++)
				{System.out.print("\t");
				System.out.print(b[i][j]);}	
				System.out.println(" ");}
				
	}
}
		