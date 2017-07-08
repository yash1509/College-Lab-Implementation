#include <stdio.h>
#include <malloc.h>
	struct node
	{
		int data;
		struct node *next;
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
				start=new_node;
			}
			printf("\n Enter the data");
			scanf("%d",&num); 
		}
	
		
	
		return start;		
	};
struct node *insert_beg(struct node *start)
	{
		int num;
		struct node *new_node;
		printf("\n Enter data");
		scanf("%d",&num);
		new_node = (struct node*)malloc(sizeof(struct node*));
		new_node->data=num;
		new_node->next=start;
		start=new_node;
		return start;
		
	};
	

struct node *insert_end(struct node *start)
{
	int num;
	struct node *new_node1;
	printf("Enter the data");
	scanf("%d",&num);
	new_node1=(struct node*)malloc(sizeof(struct node*));
	new_node1->data=num;
	struct node *ptr;
	ptr=start;
	while(ptr->next!=NULL)
	{
		ptr=ptr->next;
	}
		new_node1->next=NULL;
			ptr->next=new_node1;
	
		return start;
};

struct node *insertbf(struct node *start)
{
	int num1;
	struct node *new_node2;
	new_node2=(struct node*)malloc(sizeof(struct node*));
	struct node *ptr1;
	struct node *preptr1;
 	ptr1=start;
	printf("Enter the value to be inserted");
	scanf("%d",&num1);
	printf("Enter the element before which node is to be inserted");
	int nu;
	scanf("%d",&nu);
	new_node2->data=num1;
	preptr1=ptr1;
	while (ptr1->data!=nu)
	{	
		preptr1=ptr1;
		ptr1=ptr1->next;
	}
	

	preptr1->next=new_node2;
		new_node2->next=ptr1;
		
	return start;
	
};


struct node *insertaf(struct node *start)
{
	int num1;
	struct node *new_node2;
	new_node2=(struct node*)malloc(sizeof(struct node*));
	struct node *ptr1;
	struct node *preptr1;
	ptr1=start;
	printf("Enter the value to be inserted");
	scanf("%d",&num1);
	printf("Enter the element after which node is to be inserted");
	int nu;
	scanf("%d",&nu);
	new_node2->data=num1;
	preptr1=ptr1;
	while (preptr1->data!=nu)
	{	
		preptr1=ptr1;
		ptr1=ptr1->next;
	}
	preptr1->next=new_node2;
	new_node2->next=ptr1;
	
	return start;
	
};

struct node *insertsort(struct node *start)
{
	int num1;
	struct node *new_node2;
	new_node2=(struct node*)malloc(sizeof(struct node*));
	struct node *ptr1;
	struct node *preptr1;
	ptr1=start;
	printf("Enter the value to be inserted");
	scanf("%d",&num1);
	new_node2->data=num1;
	preptr1=ptr1;
	while (ptr1->data<num1)
	{	
		preptr1=ptr1;
		ptr1=ptr1->next;
	}
	preptr1->next=new_node2;
	new_node2->next=ptr1;
	
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
		
		
int main()
{	int opt;
	do
	{
		printf(" \n1. To create a linked list \n");
		printf(" \n2. To display a linked list \n");
		printf(" \n3. To insert a node at the beginning \n");
		printf(" \n4. To insert a node at the end \n");
		printf(" \n5. To insert a node before an element \n");
		printf(" \n6. To insert a node after an element \n");
		printf(" \n7. To insert a node in a sorted linked list \n");	
		
		scanf("%d", &opt);
	
		switch(opt)
		{
			case 1: start=Create_ll(start);
			break;
			case 2: start=display(start);
			break;
			case 3: start=insert_beg(start);
			break;
			case 4: start=insert_end(start);
			break;
			case 5: start=insertbf(start);
			break;
			case 6: start=insertaf(start);
			break;
			case 7: start=insertsort(start);
			break;
		}
	}while(opt!=0);
}	
