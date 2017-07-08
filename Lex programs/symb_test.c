#include<stdio.h>
#include<ctype.h>
#include<string.h>
#include<stdlib.h>
int track=0,line=1; char rec[5]={'m','a','i','n'}; char rend;
FILE *fp; int flag;
char del[18]={' ' , '\t' , '\n' , ',' , '(' , ')' , '[' , ']' , '{' , '}' , '#' , '+' , '-' , '*' , '/' , '%' , '=' , '!'};
//char log[4][4]={"&&","||","++","--"};
char extra[5][10]={"define","include","getch","printf","scanf"};
char k[30][12]={"void","int","float","double","bool","char","extern","static","auto","goto","class","bool","struct","for","if","register","long","while","do","else","return","continue","default","break","sizeof","switch","typedef","unsigned","union","main"};
char typeholder[12];
struct stab
{
	char id[20];
	char type[20];
	int size;
	char scope;
}s[30];

int keyword(char arr[])
{
	int i,j;
	for(i=0;i<5;i++)
		if( strcmp(extra[i],arr)==0 )
		{
			printf("%d %s		Keyword\n",line++,arr);
			return 1;
		}
	for(i=0;i<30;i++)
		if( strcmp(k[i],arr) == 0 )
		{
			strcpy(typeholder,k[i]);
			printf("%d %s		Keyword\n",line++,arr);
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
			if((strcmp(rec,"main")==0))
			{
				s[track].scope='l';
				flag++;
			}
			else
				s[track].scope='g';
			if(!(c==' '|| c=='\t'||c=='\n'))
			{
					printf("%d %c		Symbol\n",line++,c);	
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
			printf("%d %s		Redeclaration\n",line++,arr);
			return;
		}
		else if(((strcmp(arr,s[i].id))==0)&&((strcmp(typeholder,s[i].type))!=0)&&((strcmp(typeholder,"NULL")!=0)))
		{
			printf("%d %s		Multiple declaration\n",line++,arr);
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
			printf("%d %s		Undeclared variable\n",line++,arr);
			return;
		} 
		strcpy(s[track].id,arr);
		strcpy(s[track].type,typeholder);
		if(strcmp(s[track].type,"int")==0)
			s[track].size=4;
		if(strcmp(s[track].type,"float")==0)
			s[track].size=4;
		if(strcmp(s[track].type,"double")==0)
			s[track].size=8;
		if(strcmp(s[track].type,"char")==0)
			s[track].size=1;
		if(strcmp(s[track].type,"short")==0)
			s[track].size=1;
		if(strcmp(s[track].type,"long")==0)
			s[track].size=4;
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
		printf("%d %s\t\tIdentifier (%s) Size=%d Scope=%c\n",line++,s[i].id,s[i].type,s[i].size,s[i].scope);
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
			printf("%d %c		Symbol\n",line++,c);
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
				printf("%d %c		Symbol\n",line++,c);
				while( (c=fgetc(fp)) != '>');
				printf("%d %c		Symbol\n",line++,c);
			}
		else if(c=='"')
			{
				printf("%d %c		Symbol\n",line++,c);
				while( (c=fgetc(fp)) != '"' ); 
				printf("%d %c		Symbol\n",line++,c);
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
	printf("\nSymbol table \n \n");
	printf("\nSerial Identifier\tType\n");
	form();
	display();
	fclose(fp);
}

