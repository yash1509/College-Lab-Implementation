#include<stdio.h>
#include<conio.h>
#include<malloc.h>

struct node
{
int data;
struct node *next;
}*start=NULL;


void create()
{
char ch;
 do
 {
  struct node *new_node,*current;

  new_node=(struct node *)malloc(sizeof(struct node));

  printf("\nEnter the data : ");
  scanf("%d",&new_node->data);
  new_node->next=NULL;

  if(start==NULL)
  {
  start=new_node;
  current=new_node;
  }
  else
  {
  current->next=new_node;
  current=new_node;
  }

 printf("\nDo you want to creat another : ");
 ch=getche();
 }while(ch!='n');
}

int c=1;
void display()
{
struct node *new_node;
 printf("\nThe Linked List : \n");
 new_node=start;
 while(new_node!=NULL)
   {
   printf("%d--->",new_node->data);
   new_node=new_node->next;
   c++;
   }
  printf("NULL");
}

	
	
void fun()
{
	int i,j,k;
	struct node *ptr=start,*preptr=start,*ch=ptr;
	for(i=1;i<c;i++)
	{
		while(ptr!=NULL)
		{
			ch=ptr;
			ptr=ptr->next;
		}
		ptr->next=preptr->next;
		preptr->next=ptr;
		ch->next=NULL;
		preptr->next->next;
	}
}

void main()
{
create();
display();
printf("Display after changes:");
fun();
display();
}

