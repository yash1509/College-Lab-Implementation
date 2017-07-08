#include <stdio.h> 
#include <malloc.h> 
#include <stdlib.h>
struct node
	{
		int data;
		struct node *next;
		struct node *prev;
	};
struct node *start=NULL;
struct node *Create_ll(struct node *start)
	{
		struct node *new_node;
		int num;
		printf("\n Enter -1 to end");
		printf("\n Enter the data");
		scanf("%d",&num);
		
		while (num!=-1)
		{
			new_node=(struct node*)malloc(sizeof(struct node*));
			new_node->data=num;
			if (start==NULL)
			{
				new_node->next=NULL;	
				start =new_node;
			}
			else 
			{
				new_node->next=start;
				new_node->prev=NULL;
				start=new_node;
			}
			printf("\n Enter the data");
			scanf("%d",&num); 
		}
		return start;		
	};
	
	struct node *display (struct node*start)
	{
		struct node *ptr;
		ptr=start;
		while(ptr!=NULL)
		{
			printf("%d \t",ptr->data);
			ptr=ptr->next;
		}return start;
	};
		

struct node *delete1(struct node *start)
{
	struct node *ptr;
	ptr=start;
	if(start==NULL)
	printf("No element to for deletion present in the list.");
	else
		{
		start=ptr->next;
		start->prev=NULL;
		free (ptr);
	}
	printf("\n \n");
	return start;
	};	
	
struct node *delete_end(struct node *start)
{
	struct node *ptr1;
	ptr1=start;
	if(start==NULL)
	printf("No element to for deletion present in the list.");
	else
	{
	
			while(ptr1->next!=NULL)
		{
			ptr1=ptr1->next;
		}
			
			ptr1->prev->next=NULL;
		free (ptr1);
	
		printf("\n \n");
	return start;
	}
	};		
	
	
struct node *delete_after(struct node *start)
{
	struct node *ptr2;
	ptr2=start;
	if(start==NULL)
	printf("No element to for deletion present in the list.");
	else
	{
		printf("Enter the element after which the node has to be deleted");
		int del;
		scanf("%d",&del);
			while(ptr2->data!=del)
		{
			ptr2=ptr2->next;
		}
		struct node *temp;
		temp=ptr2->next;
		ptr2->next=temp->next;
		temp->next->prev=ptr2;
		free (temp);	
		printf("\n \n");
	return start;
	}
	};	
	
	struct node *delete_sort(struct node *start)
{
	struct node *ptr2;
	ptr2=start;
	if(start==NULL)
	printf("No element to for deletion present in the list.");
	else
	{
		printf("Enter the element for deletion in sorted linked list");
		int del;
		scanf("%d",&del);
			while(ptr2->data>del)
		{
			ptr2=ptr2->next;
		}
		struct node *temp;
		temp=ptr2->prev;
		temp->next=ptr2->next;
		ptr2->next->prev=temp;
	
		printf("\n \n");
	return start;
	}
	};	
	
int main()
{	int opt;
	do
	{
		printf(" \n1. Create \n");
		printf(" \n2. Display\n");
		printf(" \n3. Delete first \n");
		printf(" \n4. Delete last \n");
		printf(" \n5. Delete after specified node \n");
		printf(" \n6. Delete node in sorted linked list \n");
		scanf("%d", &opt);
	
		switch(opt)
		{
			case 1: start=Create_ll(start);
			break;
			case 2: start=display(start);
			break;
			case 3: start=delete1(start);
			break;
			case 4: start=delete_end(start);
			break;
			case 5: start=delete_after(start);
			break;
			case 6: start=delete_sort(start);
			break;
		}
	}while(opt!=0);
}	
