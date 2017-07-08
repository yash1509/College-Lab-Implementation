#include<stdio.h>
void main()
{
int a[20],pos,i,j,n,m, num;

printf("No of elements in the array");
scanf("%d",&m);

for(i=0; i<=m-1; i++)
	{
	   printf("Enter the Element of a[%d]= ",i);
	   scanf("%d",&a[i]);
	}

printf("Enter the number which you wish to delete.");
   scanf("%d", &num);

for(i=0;i<m;i++)
{
	if (a[i]==num)
		{
			for (j=i;j<=m-1;j++)
			a[j] = a[j+1];
		}

}
m--;

for(i=0; i<=m-1; i++)
	{
	   printf("Element of Array a[%d]= %d\n",i,a[i]);
	}
}

