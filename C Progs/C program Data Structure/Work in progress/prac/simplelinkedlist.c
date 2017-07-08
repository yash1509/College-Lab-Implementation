#include <stdio.h>
#include <stdlib.h>
#define pf printf;
struct node
{
	int d;
	struct node *ne; 
};
struct node *start=NULL;

void create()
{
	int dat;
	struct node *new_node;
	printf("Enter the element");
	scanf("%d",&dat);
	printf("Enter -1 to stop the process");
	while(dat!=-1)
	{
	new_node=(struct node*)malloc(sizeof(struct node));
	new_node->d=dat;
	if(start==NULL)
	{
		new_node->ne=start4w;
		start=new_node;
	}
	else
	{
		new_node->ne=start;
		start=new_node;
	}
	printf("Enter the element");
	scanf("%d",&dat);	
	}
}

void addbeg()
{
	int num;
	printf("Enter the data :");
	scanf("%d",&num);
	struct node *new_node;
	new_node=(struct node*)malloc(sizeof(struct node));
	new_node->ne=start;
	start=new_node;
}

void delend()
{
	struct node *ptr=start;
	struct node *preptr=ptr;
	while(ptr->ne!=NULL)
	{
		preptr=ptr;
		ptr=ptr->ne;
	}	
	preptr->ne=NULL;
	free(ptr);
}

void disp()
{
	struct node *ptr=start;
	while(ptr!=NULL)
	{
		printf("%d \t",ptr->d);
		ptr=ptr->ne;
	}
}

void main()
{
	int opt;
	while(opt!=5)
	{
		printf("Press for :- \n1. Create list \n2. Add at beginning\n3. Delete at the end\n4. Display\n5. Exit\nEnter your choice : ");
		scanf("%d",&opt);
		switch(opt)
		{
			case 1:create(); break;
			case 2:addbeg(); break;
			case 3:delend(); break;
			case 4:disp(); break;
			case 5:exit(0); break;
			default:pf("Wrong choice");
			
		}
		printf("Enter your choice");
		scanf("%d",&opt);
		
	}
}
