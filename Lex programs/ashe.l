%{
	#include<stdio.h>
%}
LETTER [a-zA-Z]
DIGIT [0-9]
%%
for {printf("Keyword:%s\n",yytext);}
if {printf("Keyword:%s\n",yytext);}
else {printf("Keyword:%s\n",yytext);}
{LETTER}({LETTER}|{DIGIT})* {printf("Identifier : %s",yytext);}
%%
main()
{
	yylex();
}
