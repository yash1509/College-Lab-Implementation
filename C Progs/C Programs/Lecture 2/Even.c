#include <stdio.h>
void main()
{
	int num, a;
	printf("Enter a number");
	scanf("%d", &num);
	num=num%2;
	if (num==0)
	{		
		printf("Number is even \t");
	}
	else
	{
		printf("Number is odd \t");
	}
}
