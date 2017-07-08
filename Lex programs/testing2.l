%{
    #include<stdio.h>
    char arr[20];
    int n,r,x=0,temp,t2=0,i; 
%}
NUM [0-9]
%%
{NUM}+ {
n=atoi(yytext);
while(n!=0)
{
r=n%16;
x='0'+r; if(x>'9') x+=7;
arr[temp++]=x;
n=n/16;
}
for(i=temp-1;i>=t2;--i)
printf("%c",arr[i]);
t2=temp;
}       
%%
main()
{
    yylex();
}      

