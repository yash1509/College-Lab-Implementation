#include <stdio.h>
#define s 20
int arr1[s];
int arr2[s];
int t1=-1,t2=-1;

void enque(int elem)
{
	if(t1<s-1)
	arr1[++t1]=elem;
	else
	printf("stack overflow");
}

void disp()
{
	int i;
	printf("The queue is :\n");
	for(i=0;i<=t1;i++)
	{
		printf("%d \t",arr1[i]);
	}
	printf("\n");
}

void deque()
{
	if(t1==-1&&t2==-1)
	{
		printf("Error. Stacks are both empty.");
	}
	else
		if(t2==-1)
		{
			while(t1!=-1)
			{
				arr2[++t2]=arr1[t1--];
			}
		}
}

int pop()
{
	printf("The popped values are : \n");
	while(t2!=-1)
	{
		
		printf("%d\n",arr2[t2--]);
	}
}

int main()
{
	enque(5);
	enque(10);
	enque(13);
	enque(89);
	enque(145);
	disp();
	deque();
	pop();
}

