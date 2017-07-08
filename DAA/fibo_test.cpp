#include<stdio.h> 
#define N 12
int F[N];

int tdm(int n){
if(F[n] != -1)
return F[n];
F[n] = tdm(n - 1) + tdm(n - 2);
return F[n];
}
int main(){
	int i,n;
	printf("Enter a number:\n");
	scanf("%u", &n);
	F[0] = 0;
	F[1] = 1;
	for(i = 2; i <= n; ++i)
		F[i] = -1;

	tdm(n);
	for(i=0;i<n;i++)
	printf("%d\t",F[i]);
	
}
