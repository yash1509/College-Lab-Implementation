#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int sum(int arr[],int n)
{
	int i, j, ans=0;
	int store[n];
	for(i=0;i<n;i++)
		store[i]=arr[i];
	for (i=1;i<n;i++)
		for (j=0;j<i;j++)
			if(arr[i]>arr[j]&&store[i]<store[j]+arr[i])
				store[i]=store[j]+arr[i];
	
	printf("Stored Value: \n");			
	for (i=0;i<n;i++)
		printf("%d \t",store[i]);
	printf("\n");					
	for (i=0; i < n; i++ )
		if (ans<store[i])
			ans=store[i];
	return ans;
}		 
int main()
{
	int n=6;
	int a[] = {1, 101, 2, 3, 100, 4, 5}; 
	printf("Sum= %d\n",sum(a,n));
}
