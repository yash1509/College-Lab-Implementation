#include <stdio.h>
#include <math.h>
void main()
{	
	float a,b, sum, d, m, sub;
	printf("Enter any two numbers");
	scanf("%f %f", &a, &b);
	sum=a+b;
	sub=a-b;
	d=a/b;
	m=a*b;
	printf("%f is the sum of the numbers \t", sum);
	printf("%f is the substraction of the numbers \t", sub);
	printf("%f is the multiplication of the numbers \t", m);
	printf("%f is the division of the numbers \t", d);
}
