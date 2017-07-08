#include<stdio.h>
#include<stdlib.h>
#include<time.h>
struct node
{
    unsigned dist[50];
    unsigned from[50];
}rt[50];
int main()
{
	srand(time(NULL));   
	int costmat[50][50];
    int nodes,i,j,k,count=0;
	nodes=50;
	 for(i=0;i<nodes;i++)
    {
        for(j=0;j<nodes;j++)
        {
        	costmat[i][i]=0;
        	costmat[i][j]=rand() % 120;
            rt[i].dist[j]=costmat[i][j];
            rt[i].from[j]=j;
            
        }
    }
    printf("Adjacency matrix: \n\n");
    for(i=0;i<nodes;i++)
    {
        for(j=0;j<nodes;j++)
        {
        		printf("%d \t",costmat[i][j]);
    	}
    	printf("\n");
	}
        do
        {
            count=0;
            for(i=0;i<nodes;i++)
            for(j=0;j<nodes;j++)
            for(k=0;k<nodes;k++)
                if(rt[i].dist[j]>costmat[i][k]+rt[k].dist[j])
                {
				    rt[i].dist[j]=rt[i].dist[k]+rt[k].dist[j];
                    rt[i].from[j]=k;
                    count++;
                }
        }while(count!=0);
        for(i=0;i<nodes;i++)
        {
            printf("\n\n Node %d Table \n",i+1);
            for(j=0;j<nodes;j++)
            {
                printf("\t\nNode %d Via %d Dist - %d ",j+1,rt[i].from[j]+1,rt[i].dist[j]);
            }
        }
    printf("\n\n");
}
