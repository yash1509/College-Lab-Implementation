#include<stdio.h>
#include<string.h>
#define ip 1000
int max(int a,int b)
{
		return a>b?a:b;
}
int lcs(char S[],char T[])
{
		int Sl = strlen(S);
		int Tl = strlen(T);
		int i,j;
		for(i=Sl;i>=1;i--)
		{
			S[i] = S[i-1];
		}
		for(i=Tl;i>=1;i--)
		{
			T[i] = T[i-1];
		}
		int co[Sl+1][Tl+1];
		for(i=0;i<=Tl;i++)
		{
			co[0][i]=0;
		}
		for(i=0;i<=Sl;i++)
		{
			co[i][0]=0;
		}
		for(i=1;i<=Sl;i++)
		{
				for(j=1;j<=Tl;j++)
				{
						if(S[i] == T[j] )
						{
							co[i][j] = co[i-1][j-1] + 1;
						}
						else
						{
							co[i][j] = max(co[i][j-1],co[i-1][j]);
						}

				}
		}
        return co[Sl][Tl];

}
int main()
{
		char S[ip],T[ip];
		printf(" Enter two strings:");
		scanf("%s%s",S,T);
        printf("%d\n",lcs(S,T));
}
