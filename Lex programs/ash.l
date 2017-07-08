%{
	#include<stdio.h>
	int key=0, op=0, id=0;
%}
LETTER [a-zA-Z]
DIGIT [0-9]
%%
(main|auto|for|while|do|if) {key++; printf("Keyword:%s\n",yytext);}
[-+*/%] {op++; printf("Operator :%s\n",yytext);}
[,;\.] ;
{LETTER}({LETTER}|{DIGIT})* {id++; printf("Identifier :%s\n",yytext);}
%%
main()
{
	yylex();
	printf("Identifier=%d\n",id);
	printf("Operator=%d\n",op);
	printf("Keyword=%d\n",key);
}
