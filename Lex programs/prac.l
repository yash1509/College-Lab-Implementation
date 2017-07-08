%{
	#include<stdio.h>    
	int i=1;
%}
%%
[a-z A-Z0-9+%/*]+ {printf("%d 	%s",i++,yytext);}
%%

main()
{
yylex();
}
