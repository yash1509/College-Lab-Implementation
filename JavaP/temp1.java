import java.io.*;
class arra
{
	public static void main(String args[])throws IOException
	{	
		int i,j,m,n,o,p;
		int a[][]=new int[20][20];
		int b[][]=new int[20][20];
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of first array");
		n=Integer.parseInt(obj.readLine());
		m=Integer.parseInt(obj.readLine());
		System.out.println("Enter the elements of first array");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=Integer.parseInt(obj.readLine());
		System.out.println("Enter the size of second array");
		o=Integer.parseInt(obj.readLine());
		p=Integer.parseInt(obj.readLine());
		System.out.println("Enter the elements of second array");
		for(i=0;i<o;i++)
			for(j=0;j<p;j++)
				a[i][j]=Integer.parseInt(obj.readLine());
	public static int[][] sum(int a[][], int b[][])
	{
		if(m!=o||n!=p)
			System.out.println("Addition not possible");
		else
		{
			int temp[][]=new int[m][n];
			for(i=0;i<m;i++)
				for(j=0;j<n;j++)
					temp[i][j]=a[i][j]+b[i][j];
			System.out.println("The matrix is:");
			for(i=0;i<m;i++)
				for(j=0;j<n;j++)
					System.out.println(temp[i][j]);
			
		}


	}

	}
}
