#include<stdio.h>

struct student
{
	int memroll;
	int mark1;
	int mark2;
	int mark3;
}person[100];

void main()
{
	int i, total[5];
	for(i = 0; i < 5; i++)
	{
		printf("\nStudent %d", i+1);
		printf("\nEnter roll no. : ");
		scanf("%d", &person[i].memroll);
		printf("Enter mark1 : ");
		scanf("%d", &person[i].mark1);
		printf("Enter mark2 : ");
		scanf("%d", &person[i].mark2);
		printf("Enter mark3 : ");
		scanf("%d", &person[i].mark3);
		total[i] = person[i].mark1+person[i].mark2+person[i].mark3;
	}
	printf("\n\n\nThe data entered is : ");
	for(i = 0; i < 5; i++)
	{
		printf("\n\nStudent %d", i+1);
		printf("\nRoll No. : %d", person[i].memroll);
		printf("\nTotal Marks : %d", total[i]);
	}
	printf("\n\n.");
} 
