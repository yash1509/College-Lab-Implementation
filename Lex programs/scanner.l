%{
#include<stdio.h>
int num[10]={0,1,2,3,4,5,6,7,8,9};
int num2[10]={10,20,30,40,50,60,70,80,90};
int num3[10]={100,200,300,400,500,600,700,800,900};
%}
%%
zero {printf("%d",num[0]);}
one {printf("%d",num[1]);}
two {printf("%d",num[2]);}
three {printf("%d",num[3]);}
four {printf("%d",num[4]);}
five {printf("%d",num[5]);}
six {printf("%d",num[6]);}
seven {printf("%d",num[7]);}
eight {printf("%d",num[8]);}
nine {printf("%d",num[9]);}
%%
int main()
{
yylex();
}



