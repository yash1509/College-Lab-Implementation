#include <stdio.h>
#define size 50
int s[size];
int top=-1;

int push(int elem)
{
	s[++top]=elem;
}

int pop()
{
	return(s[top--]);
}

void main()
{
	char pos[50], temp;
	int i;
	printf("Enter the postfix expression:");
	gets(pos); int op1,op2;
	while((temp=pos[i++])!='\0')
	{
		if(isdigit(temp))
			push(temp-'0');
		else
		{
			op1=pop();
			op2=pop();
			switch(temp)
			{
				case '+': push(op2+op1); break;
				case '-': push(op2-op1); break;
				case '*': push(op2*op1); break;
				case '/': push(op2/op1); break;
			}
		}
		
	}
	printf("\n Given Postfix Expn: %s\n",pos);
 	printf("\n Result after Evaluation: %d\n",s[top]);
}
	

