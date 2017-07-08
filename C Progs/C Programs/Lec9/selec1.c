#include<stdio.h>
int main()
{
	int n,a[10],i,j,t,min;
	printf("Enter the size of array= ");
	scanf("%d",&n);
	for(i=0; i<=n-1; i++)
	{
	  printf("Enter the element of a[%d]= ",i);
	  scanf("%d",&a[i]);
	}
	for(j=0; j<=n-2; j++)
	{
	  min=j;
	  for(i=j+1; i<=n-1; i++)
	  {
	    if(a[i]<a[min])
	    {
		min=i;
	    }
	  }
	  if(min!=j)
	  {
	    t=a[min];
	    a[min]=a[j];
	    a[j]=t;
	  }
	}
	for(i=0; i<=n-1; i++)
	{
	  printf("Element of a[%d]= %d\n",i,a[i]);
	}
	return 0;
}
