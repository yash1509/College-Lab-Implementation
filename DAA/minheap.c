#include <stdio.h> 
void heapify(int arr[], int n, int i)
{
    int largest = i;  
    int t;
    int l = 2*i;  
    int r = 2*i+1;  
    if (l < n && arr[l] < arr[largest])
        largest = l;
    if (r < n && arr[r] < arr[largest])
        largest = r;
    if (largest!= i)
    {	
		t=arr[i];
    	arr[i]=arr[largest];
    	arr[largest]=t;
        heapify(arr, n, largest);
    }
}
 
void heapSort(int arr[], int n)
{	int i; int t;
    for ( i = n / 2; i >= 0; i--)
        heapify(arr, n, i);
    for (i=n-1; i>=0; i--)
    {
        t=arr[i];
    	arr[i]=arr[0];
    	arr[0]=t;
        heapify(arr, i, 0);
    }
}
 
int main()
{
     int i,n,arr[100];
	printf("Enter size of array:");
	scanf("%d",&n);
	printf("Enter elements of array:");
	for(i=0;i<n;i++)
	scanf("%d",&arr[i]);
    heapSort(arr, n);
    printf("Sorted array is \n");
    for (i=0; i<n; ++i)
        printf("%d \t",arr[i]);
}
 

