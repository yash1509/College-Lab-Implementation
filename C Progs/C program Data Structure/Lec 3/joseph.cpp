#include <stdio.h> 
#include <malloc.h> 
#include <stdlib.h>
int main()
{
		int k,l;
		struct node
		{ 
		int pl;
		struct node *next;
		};
		
		struct node *p,*q; int i,count;
		printf("Enter no of players:");
		scanf("%d",&k);
		printf("Enter offset :");
		scanf("%d",&l);
		p=q=(struct node)malloc(sizeof(struct node));
		p->pl=1;
		for(i=2;i<=l;++i)
			{
					p->next=(struct node)malloc(sizeof(struct node));
					p=p->next;
					p->pl=i;
			}
			p->next=q;
			for(count=k;count>l;--count)
			{
				for(i=0;i<l-1;++i)
					p=p->next;
					p->next=p->next->next;
			}
			printf("last player alive %d",p->pl);
			return 0;
		
}	
