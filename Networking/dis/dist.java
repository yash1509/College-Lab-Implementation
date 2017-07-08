import java.io.*;
import java.util.*;
class node
{
	int dist; int fr;
	public node(int dist,int fr)
	{
		this.dist=dist;
		this.fr=fr;
	}
	
}
class dist
{
	public static void main(String args[])
	{
		int i=0,j=0,k=0,l=0,fl=0,count=0,nodes=50;
		int cos[][]=new int[50][50];
		int dist[]=new int[50];
		int from[]=new int[50];
		List<node> list=new LinkedList<node>();
		Random rand = new Random();
		for(i=0;i<50;i++)
		{	for(j=0;j<50;j++)
			{	
				
				cos[i][j] = rand.nextInt(20);
				cos[i][i]=0;
				k=cos[i][j];
				dist[j]=k;
				from[j]=j;
				node n1=new node(k,j);
				list.add(n1); 
			}
		}
		for(node n1:list)
		{
			System.out.println(n1.dist+" "+n1.fr);
		}
		do
        	{
        	    count=0;
        	    for(i=0;i<nodes;i++)//We choose arbitary vertex k and we calculate the direct distance from the node i to k using the cost matrix
        	    //and add the distance from k to node j
        	    for(j=0;j<nodes;j++)
		    for(k=0;k<nodes;k++)
			{
				if(dist[j]>costmat[i][k]+rt[k].dist[j])
        	        	{//We calculate the minimum distance
        	        	    rt[i].dist[j]=rt[i].dist[k]+rt[k].dist[j];
        	        	    rt[i].from[j]=k;
        	        	    count++;
        	        	}
			}        
        	}while(count!=0);
*/        	for(i=0;i<nodes;i++)
        	{
        	    printf("\n\n For router %d\n",i+1);
        	    for(j=0;j<nodes;j++)
        	    {
        	        printf("\t\nnode %d via %d Distance %d ",j+1,rt[i].from[j]+1,rt[i].dist[j]);
                    }
                }		
*/
	}
}