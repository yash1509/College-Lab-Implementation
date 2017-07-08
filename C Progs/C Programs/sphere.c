#include <stdio.h>
#include <math.h>
void main()
{
	float r, ar, vol;
	printf("Enter the radius of sphere");
	scanf("%f", &r);
	vol=4/3*3.148*r*r*r;
	ar=4*3.14*r*r;
	printf("%f is the surface area", ar);
	printf("%f is the volume", vol);
}
	
