#include <stdio.h>   
#include <math.h>   
void main()   
{   
 int x,fact,i,j,n,ct=0;   
 float sum=0.0;    
 printf("Enter the value for x : ") ;   
 scanf("%d",&x);   
 printf("\nEnter the value for n : ") ;   
 scanf("%d", &n);      
 for(i=3;i <=n;i+=2)   
 {ct++;
  fact=1;
  for(j=1;j<=n;j++)
  fact=fact*j;
sum=sum+((pow(-1,ct))*(pow(x,i)))/fact; 
 }   
 printf("Sum is:\t %f",sum) ;  
}
