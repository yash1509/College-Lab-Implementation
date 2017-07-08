#include <stdio.h>
void main()
{
	printf("Enter the principal and rate and time for calculating Simple intrest");
	float p, r, t, SI;
	scanf("%f %f %f", &p, &r, &t);
	SI=p*r*t/100;
	printf("SI is %f", SI);
} 
