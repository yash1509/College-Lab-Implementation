#include <stdio.h>
void main()
{
	int a[100],n,pos,i,j,c;
	printf("Enter the size of array");
	scanf("%d",&n);
	printf("Enter the elements");
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	printf("Checking for duplicate entries and removing them \n");
	for (i=0;i<n;i++)
		{ for (j=i+1;j<n;j++)
			{
				if (a[i]==a[j]&&i!=j)
					{
						pos=j;
						for(c=pos;c<n;c++)
							{
								a[c]=a[c+1];
							}
							n--;
					}
			}
		}
	printf("The final array is \n");
	for(i=0;i<n;i++)
		printf("%d \t",a[i]);	
}
