#include<stdio.h>
void main()
{
	int n,a[100],i,k,flag=0;	
	printf("Enter the Size of Array= ");
	scanf("%d",&n);
	for(i=0; i<=n-1; i++)
	{
	   printf("Enter the Element of a[%d]= ",i);
	   scanf("%d",&a[i]);
	}
	
	printf("Enter the key element to be found");
	scanf("%d",&k);

	for(i=0;i<n;i++)
	{
		if(a[i]==k)
		{
			printf("Position of search element is %d 				\t",i);
			flag=1;
			printf("\n");
		}
	}
		if (flag==0)
		printf("Search unsuccessful");
}
