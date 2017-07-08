%{
#include<stdio.h>
int num[10]={0,1,2,3,4,5,6,7,8,9};
int num2[10]={10,20,30,40,50,60,70,80,90};
int num3[10]={100,200,300,400,500,600,700,800,900};
int num4[10]={11,12,13,14,15,16,17,18,19};
int sum;
%}
%%
one-hundred {sum+=num3[0];}
two-hundred {sum+=num3[1];}
three-hundred {sum+=num3[2];}
four-hundred {sum+=num3[3];}
five-hundred {sum+=num3[4];}
six-hundred {sum+=num3[5];}
seven-hundred {sum+=num3[6];}
eight-hundred {sum+=num3[7];}
nine-hundred {sum+=num3[8];}
ten {sum+=num2[0];}
twenty {sum+=num2[1];}
thirty {sum+=num2[2];}
forty {sum+=num2[3];}
fifty {sum+=num2[4];}
sixty {sum+=num2[5];}
seventy {sum+=num2[6];}
eighty {sum+=num2[7];}
ninety {sum+=num2[8];}
eleven {sum+=num4[0];}
twelve {sum+=num4[1];}
thirteen {sum+=num4[2];}
fourteen {sum+=num4[3];}
fifteen {sum+=num4[4];}
sixteen {sum+=num4[5];}
seventeen {sum+=num4[6];}
eighteen {sum+=num4[7];}
nineteen {sum+=num4[8];}
zero {sum+=num[0];}
one {sum+=num[1];}
two {sum+=num[2];}
three {sum+=num[3];}
four {sum+=num[4];}
five {sum+=num[5];}
six {sum+=num[6];}
seven {sum+=num[7];}
eight {sum+=num[8];}
nine {sum+=num[9];}
\n {
if(sum!=0) 
printf("%d\n",sum); 
sum=0;}
%%
int main()
{
yylex();
}



