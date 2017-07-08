%{
	#include<stdio.h>    
	int i=1;
%}
%%
("//").*\n {printf("%s",yytext);}
%%

main()
{
yylex();
}
