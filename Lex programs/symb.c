#include<stdio.h>
#include<ctype.h>
#include<string.h>
#include<stdlib.h>
int track=0;
FILE *fp;
char del[18]={' ' , '\t' , '\n' , ',' , '(' , ')' , '[' , ']' , '{' , '}' , '#' , '+' , '-' , '*' , '/' , '%' , '=' , '!'};
char log[4][4]={"&&","||","++","--"};
char extra[5][10]={"define","include","getch","printf","scanf"};
char k[30][12]={"void","int","float","double","bool","char","extern","static","auto","goto","class","bool","struct","for","if","register","long","while","do","else","return","continue","default","break","sizeof","switch","typedef","unsigned","union","main"};
char typeholder[12];
struct stab
{
	char id[20];
	char type[20];
}s[30];

int keyword(char arr[])
{
	int i,j;
	for(i=0;i<5;i++)
		if( strcmp(extra[i],arr)==0 )
		{
			printf("%s		Keyword\n",arr);
			return 1;
		}
	for(i=0;i<30;i++)
		if( strcmp(k[i],arr) == 0 )
		{
			strcpy(typeholder,k[i]);
			printf("%s		Keyword\n",arr);
			return 1;
		}
	return 0;
}


int dcheck(char c)
{
	int i;
	for(i=0;i<18;i++)
	{
		if(c==del[i])
		{
			if(!(c==' '|| c=='\t'||c=='\n'))
			{
					printf("%s		Arithmetic Operator\n");	
			}
			return 1;
		}	
		
	}
	return 0;
	
}


void check(char arr[])
{
	int i,j,k;
	for(i=0;i<track;i++)
	{
		if((( strcmp(arr,s[i].id))==0 ) && ((strcmp(typeholder,s[i].type)) == 0 ))
		{
			printf("%s		Redeclaration\n",arr);
			return;
		}
		else if(((strcmp(arr,s[i].id))==0)&&((strcmp(typeholder,s[i].type))!=0)&&((strcmp(typeholder,"NULL")!=0)))
		{
			printf("%s		Multiple declaration\n",arr);
			return;
		}
	}
		if( strcmp(typeholder,"NULL")==0)
		{
			for(i=0;i<track;i++)
			{
				if(strcmp(arr,s[i].id)==0)
					return;
			}
			printf("%s		Undeclared variable\n",arr);
			return;
		} 
		strcpy(s[track].id,arr);
		strcpy(s[track].type,typeholder);
		track++;
}

void display()
{
	int i,j,k;
	if(track==0)
	{
		printf("Empty Table");
		return;
	}
	for(i=0;i<track;i++)
		printf("%s\t\tIdentifier (%s)\n",s[i].id,s[i].type);
}
			



void form()
{
	char a,b,c,temp[20]; int i=0,j=0,f=0,ch=0;
	strcpy(typeholder,"NULL");
	while(!feof(fp))
	{
		c=fgetc(fp);
		if(c==';'||c=='(')
		{
			printf("%c		Symbol\n",c);
			if(f==1)
			{
				temp[j]='\0';
				j=0; f=0;
				ch=keyword(temp);
				if(ch==0)
					check(temp);
			}
			strcpy(typeholder,"NULL");
		}
		else if(c=='<')
			{
				printf("%c		Symbol\n",c);
				while( (c=fgetc(fp)) != '>');
				printf("%c		Symbol\n",c);
			}
		else if(c=='"')
			{
				printf("%c		Symbol\n",c);
				while( (c=fgetc(fp)) != '"' ); 
				printf("%c		Symbol\n",c);
			}
		else if(dcheck(c))
		{
			if(f==1)
			{
				temp[j]='\0';
				j=0; f=0;
				ch=keyword(temp);
				if(ch==0)
					check(temp); 
			}
		}
		else if(isalpha(c)||c=='_')	
		{
			temp[j++]=c;		
			f=1;			
		}	
	}
}


int main()
{
	char fname[12]; char c;
	printf("\nEnter filename : ");
	scanf("%s",fname);
	fp=fopen(fname,"r");
	printf("\n Symbol table \n \n");
	printf("\nIdentifier\tType\n");
	form();
	display();
	fclose(fp);
}

