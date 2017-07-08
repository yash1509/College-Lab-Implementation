#include<stdio.h>

void ss(int x,int arr1[])
{
	int k,l,y,temp; int n=x;
	for(l=0;l<n;l++)
	{
		printf("%d \t",arr1[l]);
	}
	printf("\n");
	for(k=0; k<n; k++)
	{
		int ind = k;
		for(y=k; y<n; y++)
		{
			if(arr1[ind]>arr1[y])
			{
				ind=y;
			}
		}
		int temp = arr1[k];
		arr1[k] = arr1[ind];
		arr1[ind] = temp;
	}
	printf("Sorted array is: \n");
	for(l=0;l<n;l++)
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
    ss(n,arr);
}
