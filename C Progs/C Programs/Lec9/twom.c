#include<stdio.h>
void main()
{
	int n,a[100][100],b[100][100],c[100][100],i,j,l,m,q,t,s;	
	printf("Enter the rows and columns of first Array= ");
	scanf("%d %d",&m,&n);
	for(i=0; i<=m-1; i++)
	{
		for(j=0;j<=n-1;j++)
		{
	   	printf("Enter the Element of a[%d][%d]= ",i,j);
	   	scanf("%d",&a[i][j]);
		}
	}

	printf("Enter the rows and columns of second Array= ");
	scanf("%d %d",&l,&q);
	for(i=0; i<=l-1; i++)
	{
		for(j=0;j<=q-1;j++)
		{
	   	printf("Enter the Element of b[%d][%d]= ",i,j);
	   	scanf("%d",&b[i][j]);
		}
	}
	if(l==m&&q==n)
	{
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			c[i][j]=a[i][j]+b[i][j];
			printf("%d\t",c[i][j]);
			}
		printf("\n");
		}
	}
	else
	printf("Addition not possible");
}
