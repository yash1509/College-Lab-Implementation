#include <stdio.h>
void main()
{
	float num;
	printf("Enter a number");
	scanf("%f", &num);
	if (num>0)
	{		
		printf("Number is positive \t");
	}
	else
	{	
		if (num==0)
		printf("Number is zero");
		else
		printf("Number is negative \t");
	}
	
}
