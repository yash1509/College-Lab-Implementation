#include<stdio.h> 
void main() 
{ 
     int a[10][10],sum=0,sm=0; 
     int i,j,m,n; 
     printf("Enter Order of Matrix : "); 
     scanf("%d%d",&m,&n); 
           printf("Enter Elements : "); 
           for(i=0;i<m;i++) 
               { 
                  for(j=0;j<n;j++) 
                      { 
                          scanf("%d",&a[i][j]); 
                      } 
               } 
                  for(i=0;i<m;i++) 
                      { 
                          for(j=0;j<n;j++) 
                              { 
                                  if(i+j<m-1) 
                                    { 
                                         sum+=a[i][j]; 
                                    } 
                               } 
                      } 
                          printf("\n Sum of Upper Triangle is : %d",sum); 
                          for(i=0;i<m;i++) 
                              { 
                                  for(j=0;j<n;j++) 
                                      { 
                                         if(i+j>m-1) 
                                           { 
                                                sm+=a[i][j]; 
                                            } 
                                       } 
                              } 
                                   printf("\n Sum of Lower Triangle is : %d",sm); 
                                   
                                   
                                   for(i=0;i<n;i++)
 {
 
	for(j=0;j<n;j++)
 	{
 	printf(" %d",a[i][j]);
 	}
 		printf("\n");
}
	 	sum=0;
	 int	opp_sum=0;
	 	
	 	for(i=0;i<m;++i)
 			{
		 sum=sum+a[i][i];
 			opp_sum=opp_sum+a[i][m-i-1];
			 }
 printf("\nThe Sum of the principle diagonal elements=%d\n",sum);
 printf("\nThe sum of the opposite diagonal elements=%d\n",opp_sum);
}
  
