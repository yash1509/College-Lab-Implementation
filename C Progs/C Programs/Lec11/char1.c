#include<stdio.h>
#include<string.h>
void main()
{
int i=0,c=0;
char a[100];
printf("\n enter the string \n");
gets(a);
while(a[i]!='\0')
{
	if(a[i]==' ')
		c++;
		i++;
}
i=0;
while(a[i]!='\0')
i++;
printf("the number of character including space are \n %d \n",i);
printf("the number of character excluding space are \n",i-c);
}
