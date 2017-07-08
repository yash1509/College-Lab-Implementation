#include<stdio.h>
void main()
{
	int n,a[100][100],t[100][100],i,j,m;
	printf("Enter the rows and columns of Array= ");
	scanf("%d %d",&m,&n);
	for(i=0; i<=m-1; i++)
	{
		for(j=0;j<=n-1;j++)
		{
	   	printf("Enter the Element of a[%d][%d]= ",i,j);
	   	scanf("%d",&a[i][j]);
		}
	}
	for(i=0; i<=n-1; i++)
	{
		for(j=0;j<=m-1;j++)
		t[j][i]=a[i][j];
	}	

	printf("The transpose of the matrix is");
	for(i=0; i<=m-1; i++)
	{
		printf("\n");
		for(j=0;j<=n-1;j++)
			printf("%d \t",t[i][j]);
	}
}

	
