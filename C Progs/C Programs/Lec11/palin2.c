#include<stdio.h>
#include<string.h>
void main()
{
int i=0,j=0,k,flag;
char a[100];
printf("\n enter the string \n");
gets(a);
while(a[i]!='\0')
i++;
k=i-1;
while(j<k)
{
if(a[j]==a[k])
{
flag=1;
}
else
{
flag=0;
break;
}
j++;
k--;
}
if(flag==1)
printf("palindrome");
else 
printf("not palindrome");
}
