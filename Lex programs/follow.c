#include<stdio.h>
char str[50][100],t[30];
int c,n;
int check(int i,int j,int p[],int key)
{
	int k;
	if(!key)
	{
		for(k=0;k<n;k++)
		if(str[i][j]==str[k][0])
			break;
		p[0]=i;p[1]=j+1;
		test(k,p);
		return 0;
	}
	else
	{
		for(k=0;k<=c;k++)
		{
			if(str[i][j]==t[k])
				break;
		}
		if(k>c)
			return 1;
		else 
			return 0;
  	}
}
void test(int i,int p[])
{
 int j,k,key;
 for(j=2;str[i][j] != NULL; j++)
 {
 	if(str[i][j-1]=='>')
 	{
 		if(str[i][j]>= 'A' && str[i][j]<='Z')
 		{
			
 		}
 		else
 		{
 			key = 1;
 			if(check(i,j,p,key))
 				t[++c] = str[i][j];
 			if(str[i][j]=='@'&& p[0]!=-1) 
 			{
 				if(str[p[0]][p[1]]>='A' && str[p[0]][p[1]] <='Z')
 				{
 					key=0;
 					check(p[0],p[1],p,key);
 				}
 				else if(str[p[0]][p[1]] != '>'&& str[p[0]][p[1]]!=NULL)
				     {
 					if(check(p[0],p[1],p,key))
 						t[++c]=str[p[0]][p[1]];
 				     }
 			}
 		}
 	}
 }
}
 
void main()
{
	int i,j,p[2];
	printf("Enter no. of productions ");
	scanf("%d",&n);
	printf("Enter productions \n");
	for(i=0;i<n;i++)
		scanf("%s",str[i]);
	for(i=0;i<n;i++)
	{
		test(i,p);
		printf("Follow of %c : ",str[i][0]);
		for(j=0;j<=c;j++)
			printf("\t %c",t[j]);
		printf("\n");
   	}
}
 
 
