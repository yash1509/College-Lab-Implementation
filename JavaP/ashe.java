class A
{	int i,j;
	int arr[][];
		int r,c;
	A(int a,int b)
	{
		r=a;
		c=b;
		arr=new int[r][c];
	}

	int[][] getMatrix()
	{
	BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the elements of first array");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j]=Integer.parseInt(obj.readLine());
	
		System.out.println("Enter the elements of second array");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j]=Integer.parseInt(obj.readLine());
	}
	int[][] sum(int a[][],int b[][])
	{	
		int temp[][]=new int[r][c];
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				temp[i][j]=a[i][j]+b[i][j];
		return temp;
		System.out.println("The matrix is : ");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
			System.out.println(temp[i][j]);
	}
}
class ashe
{	
	public static void main(String args[])throws IOException
	{	
		A obj11=new A();
		A obj12=new A();
		obj11.getMatrix();
		obj12.sum(int a[][],int b[][]);
	}
}