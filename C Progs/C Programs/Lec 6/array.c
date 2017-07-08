#include<stdio.h>
int main()
{
	int n,a[10],i;
	printf("*******To Create an Array*******\n");	
	printf("Enter the Size of Array= ");
	scanf("%d",&n);
	for(i=0; i<=n-1; i++)
	{
	   printf("Enter the Element of a[%d]= ",i);
	   scanf("%d",&a[i]);
	}
	for(i=0; i<=n-1; i++)
	{
	   printf("Element of Array a[%d]= %d\n",i,a[i]);
	}
	return 0;
}
