#include<stdio.h>
void main()
{
	char *ch;
	gets(ch);
	int i=0;
	while(ch[i]!='\0')
	{
		printf("%c",ch[i]);	
		i++;
	}
	
}
