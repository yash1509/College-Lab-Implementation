%{
#include<stdio.h>
%}
html <.*>
%%
"<"[^>]*> { printf("%s\n",yytext); }
.|\n     ; 
%%
int main()
{
yylex();
}



