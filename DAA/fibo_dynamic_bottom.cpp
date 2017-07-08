#include<stdio.h>

int fib(int n)
{
	int f[n+1]; int i;
	f[0]=0;
	f[1]=1;
	
	for(i=2;i<=n;i++)
	{
		f[i]=f[i-1]+f[i-2];
		
	}
	printf("Series is : \n");
	for(i=0;i<n;i++)
	printf("%d\t",f[i]);
}

int main()
{
	int n=7;
	fib(n);
}
