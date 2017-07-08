#include <stdio.h>
void main()
{
	int a,b,c,n;
	printf("Enter a two digit number");
	scanf("%d", &n);
	c=n%2;
	if (c==0)
	{		
		printf("The numbers is even /t");
	}
	else
	{
		printf("The number is odd");
		a=n*n;
		b=n*n*n;
		printf("The square of number is %d \t The cube of the number is %d", a,b);
	}
}
