#include <stdio.h>
void main()
{
	int a,b,c,d,f;
	printf("Enter the no");
	scanf("%d", &a);
	b=a/3600;
	f=a%3600;
	c=f/60;
	d=f%60;
	printf("The hour is %d		 The minute is %d		 The second is %d"	, b, c, d);	
}
