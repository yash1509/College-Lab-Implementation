#include<stdio.h>
void main()
{
	int n,a[100],i,j,k,m,b[100],c[100],index;	
	printf("Enter the Size of first Array= ");
	scanf("%d",&n);
	for(i=0; i<=n-1; i++)
	{
	   printf("Enter the Element of a[%d]= ",i);
	   scanf("%d",&a[i]);
	}
	printf("Enter the Size of Array= ");
	scanf("%d",&m);
	for(i=0; i<=m-1; i++)
	{
	   printf("Enter the Element of b[%d]= ",i);
	   scanf("%d",&b[i]);
	}
	
	for(i=0;i<n;i++)
	{
		c[index]=a[i];
		index++;
	}
	for(j=0;j<m;j++)
	{
		c[index]=b[i];
		index++;
	}
	for(k=0;k<index;k++)
		printf("%d",c[k]);
	

		
}
