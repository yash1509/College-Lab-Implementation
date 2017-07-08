#include <stdio.h>
#include<stdlib.h>
#include <limits.h>
#define V 50
#include<time.h>
int k=1,flag=0,l=0,np,op;
int tracker[50];
struct node
{
    unsigned dist[50];
    unsigned from[50];
    
}rt[50];
int finmin(int dist[], bool trackset[])
{
int min = INT_MAX, min_index;

for (int v = 0; v < V; v++)
{

	if (trackset[v] == false && dist[v] <= min)
		min = dist[v], min_index = v;
	
}
/*	if(flag==0)
	{
		tracker[l++]=min_index;
		flag=1;
	}	*/
return min_index;
}

int psop(int dist[], int n,int u)
{
	int i,j;
	printf("\n\n Node %d Table \n\n",k++);
	printf("\nTo Node		Distance\n\n");
	for (int i = 0; i < V; i++)
	printf("%d \t\t %d\n", i+1,dist[i]);
}

void caldij(int graph[V][V], int src)
{
	int dist[V];	
	bool trackset[V]; 
		for (int i = 0; i < V; i++)
		dist[i] = INT_MAX, trackset[i] = false;
	dist[src] = 0;
	for (int count = 0; count < V-1; count++)
	{
	int u=finmin(dist, trackset);
	
	np=u;
	trackset[u] = true;
	for (int v = 0; v < V; v++)
	{
		if (!trackset[v] && graph[u][v] && dist[u] != INT_MAX 
									&& dist[u]+graph[u][v] < dist[v])
		{	dist[v] = dist[u] + graph[u][v]; flag=0; }
			
	}
	}
	tracker[l++]=np;
	psop(dist,V,np);
	l=1;
}

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
        	costmat[i][j]=rand() % 2240;
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

		for(i=0;i<V;i++)
			caldij(costmat, i);
	return 0;
}

