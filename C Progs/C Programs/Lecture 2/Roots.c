#include <stdio.h>
#include <math.h>
void main()
{
	float a,b,c,r,R,d,re,img;
	int f;
	printf("Enter the coeffecient of x square");
	scanf("%f", &a);
	printf("Enter the coeffecient of x");
	scanf("%f", &b);
	printf("Enter the coeffecient of CONSTANT");
	scanf("%f", &c);
	d=b*b-4*a*c;
	if (d<0)
		f=1;
	if (d==0)
		f=2;
	if (d>0)
		f=3;
	switch (f)
	{
		Case 1:
			
			re=-b/2*a;
			img=sqrt (fabs(d))/2*a;
			printf("root1= %f +i %f",re,img);
			printf("root1= %f -i %f",re,img);		
			break;
		Case 2:
			
			r=R=-b/2*a;
			printf("roots are r1=%f, re=%f",r,R);
			break;
		Case 3:
			
			r=(-b+sqrt (b*b-4*a*c))/2*a;
			R=(-b-sqrt (b*b-4*a*c))/2*a;
			printf("The roots are %f %f",r,R);
			break;
	}	
}
