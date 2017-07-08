#include <stdio.h>
void main()
{
	int a[50],c,i,j,n; 
	static int b[50];
	
	printf("Enter the size of array");
	scanf("%d", &n);
	printf("Enter the elements of array");
	scanf("%d",&a[i]);

	printf("Duplicate numbers in the array are : \t");	
	for(i=1;i<n;i++)
	{
		for(j=1;j<n;j++)
		{
			if (a[i]==a[j])
				{
					printf("%d \t",a[i]);
					b[i]=a[i];
				}
		}
	}
	
	printf("\n");
	
	if (b[0]==0)
	{	
		printf("There is no duplicate element");

		printf("The final array is : \n");

		for (i=0; i<n; i++)
		printf("%d \t",a[i]);
	}	
	else
	{
		
		printf("The final array is : \n");

		for (i=0; i<n; i++)
		printf("%d \t",b[i]);
	}	
}	

