#include <stdio.h>
#include <malloc.h>
#include <stdlib.h>

struct node
{	
	struct node *prev;
	int data;
	struct node *next;
	
};

struct node *start;

void create()
{	int num;
	struct node *start=NULL;
	struct node *new_node;
	printf("Enter the data \n");
	printf("Enter -1 to end the list \n");
	scanf("%d",&num);
	while(num!=-1)
	{
		new_node=(struct node*)malloc(sizeof(struct node*));
			
			new_node->data=num;
			if (start==NULL)
			{	
				new_node->next=NULL;
				start =new_node;
				new_node->prev=NULL;
		
			}
			else 
			{
				struct node *ptr; 
				ptr=start;
				while(ptr->next!=NULL)
				{
					ptr=ptr->next;
				}
				ptr->next=new_node;
				new_node->prev=ptr;
				
				new_node->next=NULL;
				
				
			}
			printf("\n Enter the data");
			scanf("%d",&num);
	}

	struct node *ptr1; 
	ptr1=start;
	while(ptr1!=NULL)
	{	
		printf("%d \t",ptr1->data);
		ptr1=ptr1->next;
		
	}
	
	
	
};

void insertbeg()
	{
		int num;
		struct node *new_node;
		printf("\n Enter data");
		scanf("%d",&num);
		new_node = (struct node*)malloc(sizeof(struct node*));
		new_node->data=num;
		new_node->next=start;
		start=new_node;
		new_node->prev=NULL;
		struct node *ptr5;
		int i=1;
		while(i!=0)
		{
			ptr5=ptr5->next;
			i--;
		}
		ptr5->prev=new_node;
			
		
	};

void main()
{	int opt; int a;
	do
	{
		printf(" \n1. To create and display a doubly linked list \n");
		printf(" \n2. To insert a node at the beginning \n");
		
		scanf("%d", &opt);
	
		switch(opt)
		{
			case 1: create();
			break;
			case 2: insertbeg();
			break;	
			
		}
	}while(opt!=0);
}	
			 
	
	
