#include<stdio.h>
#include<ctype.h>
int no;
char input[10][10];
void resu(char arr[],char add)
{
	int k;
	for(k=0 ;arr[k]!='\0';k++)
		if(arr[k]==add)
			return;
	arr[k]=add;
	arr[k+1]='\0';
}

void check(char* Result,char c)
{
	int i,j,k;
	char temp[20];
	int nul;
	temp[0]='\0';
	Result[0]='\0';
	if(!(isupper(c)))
	{
		resu(Result,c);
			return ;
	}
	for(i=0;i<no;i++)
	{
		if(input[i][0]==c)
		{
			if(input[i][2]=='$') 
				resu(Result,'$');
			else
			{
				j=2;
				while(input[i][j]!='\0')
				{
					nul=0;
					check(temp,input[i][j]);
					for(k=0;temp[k]!='\0';k++)
					resu(Result,temp[k]);
					for(k=0;temp[k]!='\0';k++)
					if(temp[k]=='$')
					{
						nul=1;
						break;
					}
					if(!nul)
						break;
					j++;
				}
			}
		}
	}	
	return ;
}


int main()
{
	int i,cc;
	char ch,c; char result[20];
	printf("Enter number of productions: ");
	scanf("%d",&no);
	for(i=0;i<no;i++)
		scanf("%s",input[i]);
	do
	{
		printf(" Enter element :");
		scanf(" %c",&c);
		check(result,c);
		printf("  FIRST(%c)= ",c);
		for(i=0;result[i]!='\0';i++)
		printf(" %c ",result[i]);
		printf(" Continue : ");
		scanf("%d",&cc);
	}
	while(cc==1);
}

