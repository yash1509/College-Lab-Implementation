#include <stdio.h>
#include <math.h>
void main()	
{	
	int a,b,f=1,n,i;
	printf("Enter a number for finding its factorial");
	scanf("%d", &n);
	for (i=1; i<=n; ++i)	
	{
	f=f*i;
	}
	printf("The factorial of the number is %d", f);
} 
