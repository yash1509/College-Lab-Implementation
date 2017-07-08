#include <stdio.h>
#include <math.h>
void main()
{
	float r, sa,h;
	printf("Enter the radius and height of sphere");
	scanf("%f %f", &r, &h);
	sa=2*3.14*r*h+2*3.14*r*r;
	printf("%f is the surface area of cylinder", sa);

}
	
