#include<stdio.h>
int mid;
void bs(int arr[],int f,int l,int k)
{
	if(f>l)
	{
		printf("Element not found");
	}
	mid=(f+l)/2;
	if(arr[mid]==k)
	{
		printf("Element found at %d position",mid+1);
	}
	else if(arr[mid]<k)
	{
		bs(arr,mid+1,l,k);
	}
	else
	{
		bs(arr,f,mid-1,k);
	}
}

void main()
{
	int mid,inp,first,last;
    int n,i;
    int arr[100];
    printf("Enter the no. of elements you want to enter:");
    scanf("%d",&n);
    printf("Enter the elements");
    for(i=0;i<n;i++)
    {
    	scanf("\n %d",&arr[i]);
    }
    printf("The array is :-");
    for(i=0;i<n;i++)
    {
    	printf("%d \t",arr[i]);
    }
	printf("\n Enter the element to be searched:- \n");
	scanf("%d",&inp);
	first=0; last=n-1;
	mid = (first + last)/2;
	bs(arr,first,last,inp);
	
}
