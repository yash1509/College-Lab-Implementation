#include<stdio.h>
#include<conio.h>
int a[200];

void insert(int val, int i)
{

	if(val<a[i])
	{
		if(a[2*i]==0)
		{	a[2*i]=val;  return; }

		else
		{
			i=2*i;
			insert(val,i);
		}
	}

	if(val>a[i])
	{
		if(a[2*i+1]==0)
		{	a[2*i+1]=val;  return;  }

		else
		{
			i=2*i+1;
			insert(val,i);
		}
	}

}

void display()
{
	int i;
	for(i=1;i<200;i++)
	{
		if(a[i]==0)
			continue;

		else
		{
			printf(" %d  %d\n",i,a[i]);
		}
	}
}


void deletion(int val,int i)
{
	int j,b[20],ind[20],k=1,m,item,f,x;
	if(val==a[i])
	{
		///////////// Node to be deleted has no child ///////////
		if((a[2*i]==0) && (a[2*i+1]==0))
		{
			a[i]=-1;
			return;
		}

		///////////// Node to be deleted has child ///////////
		else
		{
			j=i;

			while(1)
			{
				f=0;
				while(a[2*j]!=0)
				{
					j=2*j;
					b[k]=a[j];
					ind[k]=j;
					k=k+1;
					f=1;
					//printf("\n left child");
				}

				while(a[2*j+1]!=0)
				{	j=2*j+1;
					b[k]=a[j];
					ind[k]=j;
					k=k+1;
					f=1;
					//printf("\n right child");
				}

				if(f==0)
					break;

			}

			k=k-1;
			a[ind[k]]=-1;
			x=k;
			printf("\n\n");
			/*for(m=1;m<=k;m++)
				printf("%d  %d\n",ind[m],b[m]);
			printf("\n\n");*/

			while(x!=1)
			{
				item=b[k];
				x=x-1;
				a[ind[x]]=item;
				k=k-1;
			}

			a[i]=b[k];
			return;
		}
	}

	if(val < a[i])
	{
		i=2*i;
		deletion(val,i);
		return;
	}

	if(val > a[i])
	{
		i=2*i+1;
		deletion(val,i);
		return;
	}
}

void main()
{
	int val,ch,f=0,i;
	clrscr();

	for(i=1;i<200;i++)
		a[i]=0;

	do
	{
		printf("\n Press 1 to insert  2 to delete  3 to exit ");
		scanf("%d",&ch);

		switch(ch)
		{
			case 1: if(f==0)
				{
					printf("\n Enter value ");
					scanf("%d",&val);
					a[1]=val;
					display();
					f=1;
				}

				else
				{
					printf("Enter value");
					scanf("%d",&val);

					insert(val,1);
					display();
				}
				break;


			case 2: printf("\n Enter value");
				scanf("%d",&val);

				deletion(val,1);
				display();
				break;

			case 3: exit(0);
		}
	}while(1);

}