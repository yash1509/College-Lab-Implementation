#include <stdio.h>
#include<math.h>
void main()
{
	int n,j,i,x;
	float sum,fact;
	printf("Enter the value of x");
	scanf("%d", &x);
	printf("Enter the value of n");
	scanf("%d", &n);
	sum=x;
	for (i=3 ; i<=n ; i+=2)
		{
			fact=1;
			for (j=1; j<=i; j++)
			{			
			fact=fact*j;
			sum=sum+(pow(-1,i)*(pow(x,i)/fact));
			}
		}
		printf("The value of sin is %f", sum);
}
