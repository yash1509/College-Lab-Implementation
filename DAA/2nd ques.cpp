#include<stdio.h>
#include<limits.h>
#define stat 4
#define INF 10000
int costcal(int cost[][stat])
{
	int d[stat];
	for (int i=0; i<stat; i++)
		d[i] = INF;
	d[0] = 0;
	for (int i=0; i<stat; i++)
		for (int j=i+1; j<stat; j++)
			if (d[j] > d[i] + cost[i][j])
				d[j] = d[i] + cost[i][j];
	for(int k=0;k<stat;k++)
	printf("%d \t",d[k]);			
	return d[stat-1];
}
int main()
{
	int cost[stat][stat]={{0,9,50,90},{INF,0,37,50},{INF,INF,0,70},{INF,INF,INF,0}};

	printf("Min Cost = %d",costcal(cost));
}
