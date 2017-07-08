#include <stdio.h>
void main()
{
	int year;
	printf("Enter an year for checking if its leap year or not");
	scanf("%d", &year);
	if (year%400==0 || year%4==0 && year%100!=0)
	{		
		printf("Its a leap year. \t");
	}
	else
	{
		printf("Not a leap year. \t");
	}
}
