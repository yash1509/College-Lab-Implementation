	#include<stdio.h>
#define n 10                         
int sa(int x,int y,int G[n][n],int Sol[n][n])          /* Move check! 1= Right path. 0=Obstacle, wrong path! */   
{
 if(x>=0 && x<n && y>=0&&y<n && G[x][y]==1)
  return 1;
 else
  return 0;
}
int Ma(int G[n][n], int Sol[n][n], int x,int y)   
{
 if(x==n-1 &&y==n-1)
        {
  			
  			return 1;
        }
 if(sa(x,y,G,Sol)==1)
	{  Sol[x][y]=1;
   		if(Ma(G,Sol,x,y+1)==1)                                   
 			 return 1;
   		if(Ma(G,Sol,x+1,y)==1)                                   
  			return 1;
  		 if(Ma(G,Sol,x,y-1)==1)                                    
 			 return 1;
  		 if(Ma(G,Sol,x-1,y)==1)                                  
  			return 1;
 	  Sol[x][y]=0;
    }
       return 0;
}
int main()
{
 
 int G[n][n]={	{1,1,0,0,0,0,0,0,0,1},                                   /* Compile time initialization. */            
       		  	{0,1,0,0,0,0,1,1,0,0},
       		  	{1,1,0,0,0,0,0,1,0,0},
       		  	{1,1,1,0,0,0,0,0,0,0},
	   		  	{1,0,1,1,1,0,0,0,0,0},
	   		  	{0,0,1,1,1,0,0,0,0,1},
	   		  	{0,0,0,0,1,0,0,0,0,0},
	   		  	{1,0,0,0,1,0,0,0,0,0},
	   		  	{1,1,0,0,1,1,1,1,1,1},
	   		  	{1,1,1,1,1,0,0,0,0,0},
	   		 };
 int sol[n][n] = {0};
 int i,j;
 if(Ma(G,sol,0,0)==1)
  {
  printf("Solution Exists\n");
  for(i=0; i<n;i++)
    {
     for(j=0; j<n; j++)
      {
	    printf("%d\t",sol[i][j]); }
     printf("\n");
    }
  }
 else
     printf("No Solution Exists");
 return 0;
}
