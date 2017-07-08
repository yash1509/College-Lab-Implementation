import java.util.*;
import java.lang.*;
import java.io.*;

class SPet
{
	static final int V=50;
	int minDistance(int dist[], Boolean sptSet[])
	{
		int min = Integer.MAX_VALUE, min_index=-1;

		for (int v = 0; v < V; v++)
			if (sptSet[v] == false && dist[v] <= min)
			{
				min = dist[v];
				min_index = v;
			}

		return min_index;
	}

	void printSolution(int dist[], int n)
	{
		System.out.println("Vertex Distance from Source");
		for (int i = 0; i < V; i++)
			System.out.println(i+" \t\t "+dist[i]);
	}

	void dijkstra(int graph[][], int src)
	{
		int dist[] = new int[V]; // The output array. dist[i] will hold
		Boolean sptSet[] = new Boolean[V];

		for (int i = 0; i < V; i++)
		{
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}

		dist[src] = 0;

		for (int count = 0; count < V-1; count++)
		{
			int u = minDistance(dist, sptSet);

			sptSet[u] = true;

			for (int v = 0; v < V; v++)

				if (!sptSet[v] && graph[u][v]!=0 &&
						dist[u] != Integer.MAX_VALUE &&
						dist[u]+graph[u][v] < dist[v])
					dist[v] = dist[u] + graph[u][v];
		}

		printSolution(dist, V);
	}

	public static void main (String[] args)
	{
	int i=0,j=0;
	int graph[][] = new int[50][50];
	Random rand = new Random();
	for(i=0;i<50;i++)
		{	for(j=0;j<50;j++)
			{	
				graph[i][i]=0;
				graph[i][j] = rand.nextInt(40);
			}
		}
	System.out.println("Adjacency Matrix");
	for(i=0;i<50;i++)
		{	for(j=0;j<50;j++)
			{	
				System.out.print(graph[i][j]+"	");
			}
		System.out.println("\n");
		}
	SPet t = new SPet();
	t.dijkstra(graph, 0);
	}
}
