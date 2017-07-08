#include <stdio.h>
void main()
{
	int n=0,a[100],pos=0,i=0,j=0,b=0;
	printf("Enter the size of array");
	scanf("%d",&n);
	printf("Enter the elements of array");
	for (i=0; i<n; i++)
	scanf("%d",&a[i]);

	printf("Enter the index position for the element to be deleted.");
	scanf("%d",&pos);
	
	for(i=pos;i<=n;i++)
	{
		a[i]=a[i+1];
	}	
	n--;
	
	printf("The final array is : \n");

	for (i=0; i<n; i++)
	printf("%d \t",a[i]);
}	
	
