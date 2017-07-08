#include<stdio.h>
#define N 5
int fib[N];
int fibo(int n)
{
	if(fib[n]!=-1)
		//printf("%d",fib[n]);
		return fib[n];
	else
	{
		fib[n]=fibo(n-1)+fibo(n-2);
		//printf("%d", fib[n]);
		return fib[n];
	}
}

int main()
{
	int i;
	for(i=2;i<=N;i++)
	fib[N]=-1;
	fib[0]=0;
	fib[1]=1;
	printf("The series is: \n");
	printf("%d \t",fibo(N));
}
