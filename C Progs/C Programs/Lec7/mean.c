#include<stdio.h>
int main()
{
	int n,a[100],i;
	float sum=0.0, mean=0.0;	
	printf("Enter the Size of Array= ");
	scanf("%d",&n);
	for(i=0; i<=n-1; i++)
	{
	   printf("Enter the Element of a[%d]= ",i);
	   scanf("%d",&a[i]);
	   sum+=a[i];
	}
	mean=sum/n;
	printf("The mean is %f",mean);
}
