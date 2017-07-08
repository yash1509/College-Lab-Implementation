#include<stdio.h>
void main()	
{	
	int n,b,c=0,i;
	printf("Enter a number to check whether it is prime or not");
	scanf("%d", &n);
	for (i=1; i<=n; ++i)
	{	
		b=n%i;
		if (b==0)
			{
				c=c+1;
			}
	}
	if (c>2)
	{
	printf("Not a prime number");
	}
	else
	{
	printf("Prime number");
	}
}

