#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#define V 5
#include<limits.h>
int min(int k[], bool mstSet[])
{
	int min = INT_MAX, min_index;
	for (int v = 0; v < V; v++)
	if (mstSet[v] == false && k[v] < min)
	min = k[v], min_index = v;
	return min_index;
}

int pMST(int Par[], int n, int graph[V][V])
{
	printf("Edge    Weight\n");
	for (int i = 1; i < V; i++)
	printf("%d - %d    %d \n", Par[i], i, graph[i][Par[i]]);
}


void prim(int graph[V][V])
{
	int Par[V]; 
	int k[V];
	bool mstSet[V];
	
	for (int i = 0; i < V; i++)
		k[i] = INT_MAX, mstSet[i] = false;
		
	k[0] = 0;
	Par[0] = -1;
		for (int c = 0; c < V; c++)
		{
			int u = min(k, mstSet);	
			mstSet[u] = true;
			
			for (int v = 0; v < V; v++)
				if(graph[u][v]&&mstSet[v]==false&&graph[u][v]<k[v])
					Par[v]=u,k[v]=graph[u][v];
		}
		
		pMST(Par, V, graph);
}

int main()
{	
	int gr[V][V]={	{0, 12, 13, 62, 22},
					{12, 0, 43, 98, 18},
					{11, 53, 0, 0, 27},
					{36, 8, 0, 0, 39},
					{2, 1, 17, 29, 0},
				 };

	prim(gr);
}
