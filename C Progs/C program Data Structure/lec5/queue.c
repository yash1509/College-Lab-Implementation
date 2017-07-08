#include <stdio.h>
#define s 50
int a[s];
int front=-1;
int rear=-1;

void insert(int elem)
{
	if(front==-1&&rear==-1)
	{
		front=rear=0;
	}
	a[rear++]=elem;
}

int delete1()
{
	return(a[front++]);
}

int isempty()
{
	if (front==-1)
	{
		
	printf("Stack is empty");
	exit(0);
	}
	if (front==rear+1)
	{
		
			printf("Stack is empty");
			exit(0);
	}
}

int isfull()
{
	if (rear==s-1)
		return 1;
	else 
		return 0;
	
}
void disp()
{
	int p1=front;
	int p2=rear;
	int i;
	printf("The queue is \n");
	for(i=p1;i<=p2;i++)
	{
		printf("%d \t",a[i]);
	}
}

int main()
{
	int opt; int c;

	printf("Enter your choice \n");
	printf("Enter -1 to stop the menu \n");
	while(opt!=-1)
	{
		printf("1. Insert element in a queue \n");
		printf("2. Delete element in a queue \n");
		printf("3. Display the queue \n");
		scanf("%d",&opt);
		switch(opt)
		{
			case 1:
				    if(isfull())
				    {
				    		printf("Queue is full \n");
							exit(0);
					}
				    
					printf("Enter the element you want to insert");
					scanf("%d",&c);
					insert(c);
					break;
			case 2:
					isempty();
					delete1();
					break;
			case 3:
					disp();
					
		}	
	}
}

