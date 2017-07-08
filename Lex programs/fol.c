#include<stdio.h> 
#include<string.h>
int n,m=0,p,i=0,j=0;
char a[10][10],res[10];

void  resu(char c)
{
	int i;
	for( i=0;i<=m;i++)
		if(res[i]==c)
			return;
	res[m++]=c;
}

void fi(char c)
{
	int k;
	if(!(isupper(c)))
		resu(c);
	for(k=0;k<n;k++)
	{
		if(a[k][0]==c)
		{
			if(a[k][2]=='$') 
				check(a[i][0]);
			else if(islower(a[k][2]))
					resu(a[k][2]);
				else fi(a[k][2]);
		}
	}
}

void check(char c)
{
	if(a[0][0]==c)resu('$');
	for(i=0;i<n;i++)
	{
		for(j=2;j<strlen(a[i]);j++)
		{
			if(a[i][j]==c)
			{
				if(a[i][j+1]!='\0')
					fi(a[i][j+1]);
				if(a[i][j+1]=='\0'&&c!=a[i][0])
					check(a[i][0]);

			}
		}
	}
}

int main()
{
	int i,cho;
	char c,ch;
	printf("Enter no. of productions : ");
	scanf("%d", &n);
	for(i=0;i<n;i++)
	scanf("%s",a[i]);
	do
	{
		m=0;
		printf(" Enter Element: ");
		scanf(" %c",&c);
		check(c);
		printf("  Follow(%c) =  ",c);
		for(i=0;i<m;i++)
			printf("%c ",res[i]);
		printf(" Continue: ");
		scanf("%d",&cho);
	}
	while(cho==1);
}

