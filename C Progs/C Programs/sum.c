#include <stdio.h>
#include <math.h>
void main()
{
	int a,b,c,d, sum;
	printf("Enter a 4 digit number");
	scanf("%d", &a);
	b=a%10;
	a=a/10;
	c=a%10;
	a=a/10;
	d=a%10;
	a=a/10;
	a=a%10;
	sum=b+c+d+a;
	printf("%d is the sum of the digits", sum);

}
