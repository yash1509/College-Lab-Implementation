#include<stdio.h>
void main()
{
int a[20],i,m,j,num;

printf("No of elements in the array");
scanf("%d",&m);

for(i=0; i<=m-1; i++)
	{
	   printf("Enter the Element of a[%d]= ",i);
	   scanf("%d",&a[i]);
	}

printf("Enter the number to be inserted in the array");
scanf("%d", &num);

for(i=0;i<m;i++)
{
	if (a[i]>num)
		{
			for (j=m-1;j>=i;j--)
			a[j+1] = a[j];
			a[i]=num;
			break;
		}

}
m++;
for(i=0; i<=m-1; i++)
	{
	   printf("Element of Array a[%d]= %d\n",i,a[i]);
	}
}

