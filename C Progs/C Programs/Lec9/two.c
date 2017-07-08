#include<stdio.h>
void main()
{
	int n,a[100][100],i,j,k,m;	
	printf("Enter the rows and columns of Array= ");
	scanf("%d %d",&n,&m);
	for(i=0; i<=n-1; i++)
	{
		for(j=0;j<=n-1;j++)
		{
	   	printf("Enter the Element of a[%d][%d]= ",i,j);
	   	scanf("%d",&a[i][j]);
		}
	}

	for(i=0; i<=n-1; i++)
	{
		for(j=0;j<=n-1;j++)
		{
	   	printf("%d \t",a[i][j]);
		}
		printf("\n");
	}
}
