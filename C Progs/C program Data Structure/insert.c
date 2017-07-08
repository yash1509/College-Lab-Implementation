#include <stdio.h>

void main()
{
	int n=0,a[100],pos=0,i=0,j=0,b=0;
	printf("ENter the size of array");
	scanf("%d",&n);
	printf("Enter the elements of array");
	for (i=0; i<n; i++)
	scanf("%d",&a[i]);

	printf("Enter the element to be inserted");
	scanf("%d",&b);
	printf("Enter the index position for the element to be inserted.");
	scanf("%d",&pos);
	
	for(i=n-1;i>=pos;i--)
	{
		a[i+1]=a[i];
	}			
	n++;

	a[pos]=b;
	
	printf("The final array is : \n");

	for (i=0; i<n; i++)
	printf("%d \t",a[i]);
}	
	
	
