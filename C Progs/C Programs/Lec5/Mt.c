#include <stdio.h>
#include<math.h>
void main()
{
	int n,j,i,k,a;
	printf("Enter the value of n");
	scanf("%d", &n);
	printf("Enter the value of k");
	scanf("%d", &k);
	for (i=1 ; i<=n;++i)
	{
		for (j=1 ; j<=k ; j++)	
		{
			a=i*j;
			printf("%d \t", a);
		}
		
	printf("\n");	
	}
}
