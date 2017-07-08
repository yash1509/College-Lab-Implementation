%{
#include<stdio.h>
%}
%%
\/\/.* printf("%s",yytext); 
\/\*(.*\n)*.*\*\/  printf("%s",yytext);
(.)* ;
%%
main()
{
	yylex();
}


