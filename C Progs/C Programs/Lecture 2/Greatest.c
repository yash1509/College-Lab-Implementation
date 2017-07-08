#include <stdio.h>
void main()
{
	int a,b,c,n;
	printf("Enter three numbers");
	scanf("%d %d %d",&a,&b,&c);
	if (a>b)
	{		
		if (a>c)
		{ 
			printf("%d is the greatest \t", a);
		}	
		else 
		{
			printf("%d is the greatest \t", c);
		}
	}	
	else
	{
		if (b>c)
		{ 
			printf("%d is the greatest \t", b);
		}	
		else 
		{
			printf("%d is the greatest \t", c);
		}
	}
}
