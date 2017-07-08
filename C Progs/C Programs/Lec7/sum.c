#include<stdio.h>
void main()
	{
int a[20],b[20],c[20],i,n,m;

printf("No of elements in first array");
scanf("%d",&m);

for(i=0; i<=m-1; i++)
	{
	   printf("Enter the Element of a[%d]= ",i);
	   scanf("%d",&a[i]);
	}

printf("No of elements in second array");
scanf("%d",&n);

for(i=0; i<=n-1; i++)
	{
	   printf("Enter the Element of b[%d]= ",i);
	   scanf("%d",&b[i]);
	}

if(m==n)
{
	for(i=0;i<n;i++)
	{
	c[i]=a[i]+b[i];
	printf("The elements of the array are c[%d]=%d\n",i,c[i]);
	printf("\n");
	}
}
else
{
	printf("Addition is not possible");
}	
}
