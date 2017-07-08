#include<stdio.h>

struct book
{
	char auth[50];
	int price;
}b[100];

void main()
{
	int i, size, max, maxindex;
	printf("\n\nEnter no. of entries : ");
	scanf("%d", &size);
	for(i = 0; i < size; i++)
	{
		printf("\nBook %d", i+1);
		printf("\nEnter name : ");
		scanf("%s", &b[i].auth);
		printf("Enter price : ");
		scanf("%d", &b[i].price);
	}
	max = b[0].price;
	for(i = 1; i < size; i++)
	{
		if(b[i].price > max)
		{
			max = b[i].price;			
			maxindex = i;
		}
	}
	printf("\nThe costlier book is from %s costing Rs. %d", b[maxindex].auth, b[maxindex].price);
}

