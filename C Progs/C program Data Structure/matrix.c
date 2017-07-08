#include<stdio.h>
void main()
{
	int n,a[20][20],i,j,k,m,l,p,b[20][20],c[20][20],d[20][20],e[20][20],f[20][20],sum=0;
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
	printf("Enter the rows and columns of second Array= ");
	scanf("%d %d",&l,&p);
	for(i=0; i<=l-1;i++)
	{
		for(j=0;j<=p-1;j++)
		{
	   	printf("Enter the Element of a[%d][%d]= ",i,j);
	   	scanf("%d",&b[i][j]);
		}
	}
	
	if (n==l&&m==p)
	{
		printf("The addition of the two matrix is \n");
		for(i=0; i<=n-1; i++)
		{
			for(j=0;j<=m-1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				printf("%d \t",c[i][j]);
			}
			printf("\n");
		}
	}
	else
		printf("The addition of the two matrix is not possible");
	if (n==l&&m==p)
	{
		printf("The subtraction of the two matrix is \n");
		for(i=0; i<=n-1; i++)
		{
			for(j=0;j<=m-1;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				printf("%d \t",c[i][j]);
			}
			printf("\n");
		}
	}
	else
		printf("The subtraction of the two matrix is not possible \n");
	
	
	if (n!=l)
	{
		printf("The multiplication of matrix is not possible \n");
	
	
	}
	else 
	{
		printf("The multiplication of matrix is \n");
		for(i=0; i<=n-1; i++)
		{	
			for(j=0;j<=p-1;j++)
			{
				for(k=0;k<=m-1;k++)
				{	sum=0;
					sum+=a[i][k]*b[k][j];
					
				}
			f[i][j]=sum;
			}
		}
	}
	
	for(i=0; i<=n-1;i++)
		{
			for(j=0;j<=m-1;j++)
				{
	   				printf("%d \t", f[i][j]);
				}
				printf("\n");
		}
	
	printf ("The transpose of the first matrix is \n");
	
	for(i=0; i<=n-1; i++)
	{
		for(j=0;j<=m-1;j++)
		{
	   	d[i][j]=a[j][i];
		printf ("%d \t",d[i][j]);
		}
		printf("\n");
	}
	
	printf ("The transpose of the first matrix is \n");
	
	for(i=0; i<=n-1; i++)
	{
		for(j=0;j<=m-1;j++)
		{
	   	e[i][j]=b[j][i];
		printf ("%d \t",e[i][j]);
		}
		printf("\n");
	}
	
}
	
