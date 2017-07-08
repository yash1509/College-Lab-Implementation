#include<stdio.h>
#include<conio.h>
#define inf 9999
#define value 10

void dij(int arr[value][value],int n,int st_nd);

int main()
{
	int arr[value][value],i,j,n,u;
	printf("Enter no of vertices:");
	scanf("%d",&n);
	printf("\nEnter the adjacency matrix:\n");
	
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			scanf("%d",&arr[i][j]);
	printf("\nEnter the starting node:");
	scanf("%d",&u);
	dij(arr,n,u);
	return 0;
}

void dij(int arr[value][value],int n,int st_nd)
{
	int cost[value][value],dist[value],pred[value];
	int visited[value],count,mindist,nextn,i,j;
	
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			if(arr[i][j]==0)
				cost[i][j]=inf;
			else
				cost[i][j]=arr[i][j];
				
	for(i=0;i<n;i++)
	{
		dist[i]=cost[st_nd][i];
		pred[i]=st_nd;
		visited[i]=0;
	}
	dist[st_nd]=0;
	visited[st_nd]=1;
	count=1;
	while(count<n-1)
	{
		mindist=inf;
		
		for(i=0;i<n;i++)
			if(dist[i]<mindist&&!visited[i])
			{
				mindist=dist[i];
				nextn=i;
			}

			visited[nextn]=1;
			for(i=0;i<n;i++)
				if(!visited[i])
					if(mindist+cost[nextn][i]<dist[i])
					{
						dist[i]=mindist+cost[nextn][i];
						pred[i]=nextn;
					}
			count++;
	}
	
	for(i=0;i<n;i++)
		if(i!=st_nd)
		{
			printf("\nDistance of node %d = %d ",i,dist[i]);
			printf("\nPath = %d",i);
			j=i;
			do
			{
				j=pred[j];
				printf(" <- %d ",j);
			}while(j!=st_nd);
		}
}
