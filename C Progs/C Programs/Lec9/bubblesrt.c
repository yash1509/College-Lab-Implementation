#include<stdio.h>
void main()
{
	int n,a[100],i,j,flag,t;
	printf("Enter the Size of array= ");
	scanf("%d",&n);
	for(i=0; i<=n-1; i++)
	{
	  printf("Enter the Element of a[%d]= ",i);
	  scanf("%d",&a[i]);
	}
	j=1;
	flag=1;
	while((j<=n-1) && (flag==1))
	{
	  flag=0;
	  j++;
	  for(i=0; i<=n-j; i++)
	  {
	    if(a[i]>a[i+1])
	    {
		t=a[i];
		a[i]=a[i+1];
		a[i+1]=t;
		flag=1;
	    }
	  }
	}
	for(i=0; i<=n-1; i++)
	{
	  printf("Element of a[%d]= %d\n",i,a[i]);
	}
	
}

