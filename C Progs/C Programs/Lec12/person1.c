#include<stdio.h>
struct persons
{
	char membername[50];
	int doj;
	long int mobile;
}person[100];

void main()
{
	int i, size;
	printf("\n\nEnter no. of members: ");
	scanf("%d", &size);
	for(i = 0; i < size; i++)
	{
		printf("\nMember %d", i+1);
		printf("\nEnter name: ");
		scanf("%s", &person[i].membername);
		printf("Enter DOJ: ");
		scanf("%d", &person[i].doj);
		printf("Enter mobile number: ");
		scanf("%ld", &person[i].mobile);
	}
	printf("\n\n\nThe data entered is : ");
	for(i = 0; i < size; i++)
	{
		printf("\n\nMember %d", i+1);
		printf("\nName: %s", &person[i].membername);
		printf("\nDOJ: %d", person[i].doj);
		printf("\nMobile number: %ld", person[i].mobile);
	}
} 
