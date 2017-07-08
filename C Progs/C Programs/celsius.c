#include <stdio.h>
#include <math.h>
void main()
{
	float f, c, F, C;
	printf("Enter the temperature in Fahrenheit and celsius");
	scanf("%f %f", &f, &c);
	C=5/9*(f-32);
	F=9/5*(c+32);
	printf("%f is the temperature in fahrenheit", F);
	printf("%f is the temperature in celsius", C);

}
