#include<stdio.h>
#include<malloc.h>
#include<stdlib.h>

struct l
{
	int d; struct l *n; 
}*top;

void push()
{	
	int nu;
	struct l *ne;
	ne=(struct l*)malloc(sizeof(struct l));
	printf("Enter the data");
	scanf("%d",&nu);
	ne->d=nu;
	if (top==NULL)
	{
		ne->n=NULL;
		top=ne;
	}
	else
	{
			ne->n=top;
			top=ne;
	}
};

void pop()
{
	struct l *ptr;
	ptr=top;
	top=top->n;
	free (ptr);
};

void peep()
{
	struct l *ptr;
	ptr=top;
	while (ptr!=NULL)
	{
			printf("%d \n",ptr->d);
			ptr=ptr->n;
		
	}
};

 
int main() {
   int choice;
   char ans;
 
   printf("\n\tImplementation Of Stack");
   do {
      printf("\nMain Menu");
      printf("\n1.Push \n2.Pop \n3.Display \n4.exit");
      printf("\nEnter Your Choice");
      scanf("%d", &choice);
      switch (choice) {
      case 1:
       		push();
         	break;
      case 2:
        	pop();
         break;
      case 3:
         peep();
         break;
      case 4:
         exit(0);
      }
      printf("\nContinue? Y or N?");
      scanf("%s",&ans);
   } while (ans == 'Y' || ans == 'y');
 
return 0;
}
