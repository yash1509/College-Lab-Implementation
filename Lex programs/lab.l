%{
#include<stdio.h>    
int fl=1;
%}
%%
.*\n {printf("%d	%s",fl++,yytext);}
%%
int main()
{
yylex();
return 0;
}
