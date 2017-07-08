%{
#include<stdio.h>
%}
html <.*>
%%
{html} ; {printf("%s\n",yytext);}
[^html] ; 
%%
int main()
{
yylex();
}



