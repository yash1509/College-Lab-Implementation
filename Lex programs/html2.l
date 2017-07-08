%{
#include<stdio.h>
int fl=0;
%}
%%
\<html\> ; {fl++;}
\<\/html\> ; {fl++;}
(.)* ;
%%
int main()
{
yylex();
printf("No of html tag - %d",fl);
}



