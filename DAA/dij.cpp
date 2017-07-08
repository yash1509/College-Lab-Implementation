#include <stdio.h>
#include <limits.h>
#define V 5
int mD(int DIS[], bool sS[])
{
   int min = INT_MAX, min_i;
  
   for (int v = 0; v < V; v++)
     if (sS[v] == false && DIS[v] <= min)
         min = DIS[v], min_i = v;
  
   return min_i;
}
  

int pS(int DIS[], int n)
{
   printf("Vertex   Disance from Source\n");
   for (int i = 0; i < V; i++)
      printf("%d \t\t %d\n", i, DIS[i]);
}
  
  

void dij(int gr[V][V], int src)
{
     int DIS[V];
     bool sS[V];
	 for (int i = 0; i < V; i++)
        DIS[i] = INT_MAX, sS[i] = false;
  
     DIS[src] = 0;
  		
	  for (int count = 0; count < V-1; count++)
     {
       int u = mD(DIS, sS);
  
       sS[u] = true;
  
       for (int v = 0; v < V; v++)
  
         if (!sS[v] && gr[u][v] && DIS[u] != INT_MAX 
                                       && DIS[u]+gr[u][v] < DIS[v])
            DIS[v] = DIS[u] + gr[u][v];
     }
  
     pS(DIS, V);
}

int main()
{
   int gr[V][V] = {		{3, 4, 1, 2, 0},
                        {4, 9, 8, 3, 0}, 
                        {11, 8, 2, 7, 5}, 
                        {5, 6, 7, 1, 3}, 
                        {1, 0, 1, 4, 0}, 
                  };
  
    dij(gr, 2);
  
    
}

