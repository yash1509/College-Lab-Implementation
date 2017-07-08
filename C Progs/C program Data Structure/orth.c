#include <stdio.h>
void main()
{
	int n,a[20][20],i,j,k,m,l,p,f[20][20], sum=0, d[20][20];
	printf("Enter the rows and columns of first Array= ");
	scanf("%d %d",&n,&m);
	for(i=0; i<=n-1; i++)
	{
		for(j=0;j<=m-1;j++)
		{
	   	printf("Enter the Element of a[%d][%d]= ",i,j);
	   	scanf("%d",&a[i][j]);
		}
	}
	
	if (m!=n)
	{
		printf("The matrix is not of square format");
	}
	else 
	{	
	for(i=0; i<=n-1; i++)
	{
		for(j=0;j<=m-1;j++)
		{
	   	d[i][j]=a[j][i];
		}
	}
	
	
		
	for(i=0; i<=n-1; i++)
		{	
			for(j=0;j<=p-1;j++)
			{
				for(k=0;k<=m-1;k++)
				{	sum=0;
					sum+=a[i][k]*d[k][j];
					
				}
			f[i][j]=sum;
			}
		}
	
	static g[20][20];
	for (i=0;i<n;i++)
		{
			g[i][i]=1;
		}			

	for(i=0; i<=n-1; i++)
		{	
			for(j=0;j<=m-1;j++)
			{	
				if (f[i][i]!=1&&f[i][j]!=0)	
					{
					printf("The matrix is not orthogonal");
					exit();
					}
				else
					{
					printf("The matrix is not orthogonal");
					exit();
					}
			}
		}
	}
}
	
