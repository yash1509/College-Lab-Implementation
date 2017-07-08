#include <stdio.h>
#include <math.h>
void main()
{
	int sec, hr, min, S, r;
	printf("Enter the time in seconds");
	scanf("%d", &sec);
	hr=sec/3600;
	r=sec%3600;
	min=r/60;
	sec=r%60;
	printf("%d is the time in hour \t", hr);
	printf("%d is the time in min \t", min);
	printf("%d is the time in seconds \t", sec);
}
