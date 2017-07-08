#include<stdio.h>

insertionsort(int x,int arr1[])
{
	int c,d,t,l;
 	for (c =1;c<=x-1;c++) 
	 {
    	d = c;
		    while (d>0&&arr1[d]<arr1[d-1]) 
			{
		      t=arr1[d];
		      arr1[d]=arr1[d-1];
		      arr1[d-1]=t;
		      d--;
		    }
	}
	for(l=0;l<x;l++)
	{
		printf("%d \t",arr1[l]);
	}
	
}


void main()
{
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
	insertionsort(n,arr);
}
