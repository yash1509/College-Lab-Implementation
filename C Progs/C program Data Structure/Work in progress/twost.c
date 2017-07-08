#include <stdio.h>
#define s 20
int arr[s];
int t1=-1,t2=s;

void pushst1(int elem)
{
	if(t1<t2-1)
	{
		arr[++t1]=elem;
	}
	else
		printf("Stack overflow");
}

void pushst2(int elem)
{
	if(t1<t2-1)
	{
		arr[--t2]=elem;
	}
	else
	printf("Stack overflow");
}

void popst1()
{
	int val;
	if(t1>=0)
		val=arr[t1--];
	else
		
		printf("Stack empty");
	
	
}

void popst2()
{
	int val;
	if(t2<s)
	val=arr[t2++];
	else
		
		printf("Stack empty");
}

void dispst1()
{
	int i;
	for(i=t1;i>=0;i--)
		printf("%d \t",arr[i]);
	printf("\n");
}
void dispst2()
{
	int i;
	for(i=t2;i<s;i++)
		printf("%d \t",arr[i]);
	printf("\n");
		
}

int main()
{
	printf("\t\tNote - Stack supports 20 entries and stack 1=st1,stack 2=st2 \n \n");
	int ch,da;
	printf("Enter your choice - \n1.Push in st1\n2.Push in st2\n3. Pop st1\n4.Pop st2\n5.Display st1\n6.Display st2\n7.Exit \n\n");
	scanf("\n %d",&ch);
	pushst1(12);
	pushst1(1);
	pushst2(13);
	popst2();
	while(ch!=7)
	{
	
		switch(ch)
		{
			case 1:
			printf("Enter the data.");
			scanf("\n %d",&da);
			pushst1(da);
			break;
			case 2:
			printf("Enter the data.");
			scanf("\n %d",&da);
			pushst2(da);
			break;
			case 3:
			popst1();
			break;
			case 4:
			popst2();
			break;
			case 5:
			printf("The first stack contains entry :");
			dispst1();
			break;
			case 6:
			printf("The second stack contains entry :");
			dispst2();
			break;
			case 7:
			exit(0);
			
			
		}
		printf("Enter your choice");
		scanf("\n%d",ch);
	}
}
