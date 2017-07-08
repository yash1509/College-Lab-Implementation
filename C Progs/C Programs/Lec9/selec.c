#include<stdio.h>
void main()
{
	int n,a[100],i,j,t,small,pos;
	printf("Enter the size of array= ");
	scanf("%d",&n);
	for(i=0; i<=n-1; i++)
	{
	  printf("Enter the element of a[%d]= ",i);
	  scanf("%d",&a[i]);
	}
	
	for(i=0;i<n;i++)
	{
		pos=i;
		small=a[i];
		
		for(j=1;j<n;j++)
		{
			if(a[j]<small)
			{
				small=a[j];
				pos=j;
		
			}
		a[pos]=a[i];
		a[i]=small;
		}
	}
	for(i=0; i<=n-1; i++)
	{
		printf("Elements of array are \t %d",a[i]);
		printf("\n");
	}
}
