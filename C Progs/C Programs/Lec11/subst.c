nu#include<string.h>
#include<stdio.h>
void main()
{
char str[100],ptr[100];
int count=0,flag=0,i=0,j,k;
printf("enter the string");
gets(str);
printf("enter the pattern");
gets(ptr);
while(str[i]!='\0')
{
j=0;
k=i;
while((str[k]==ptr[j])&&(ptr[j]!='\0'))
{
j++;
k++;
}
if(ptr[j]=='\0')
{
count++;
flag=1;
}
i++;
}
printf("number of times pattern repeated is %d",count);
if(flag==0)
printf("pattern not found");
}

