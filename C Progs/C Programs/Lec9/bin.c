#include<stdio.h>
void main()
{
	int n,a[100],i,k,mid,beg,end,flag=0;	
	printf("Enter the Size of Array= ");
	scanf("%d",&n);
	for(i=0; i<=n-1; i++)
	{
	   printf("Enter the Element of a[%d]= ",i);
	   scanf("%d",&a[i]);
	}
	
	printf("Enter the key element to be found");
	scanf("%d",&k);
	beg=0;
	end=n-1;
	
	while (beg<=n-1)
	{
		mid=(beg+end)/2;
		if (a[mid]=k)
		{
			printf("The key element is at position 					%d \t",mid);
			flag=1;
printf("\t");
			break;
		}
		if(a[mid]>k)
			end=mid-1;
		else
			beg=mid+1;
	}
	if(flag==0)	
	printf("Process unsuccessful");
}


	
