#include<stdio.h>
void merg(int arr[],int l,int m,int h)
{		
   int arr1[10],arr2[10];   
   int n1,n2,i,j,k; 
   n1=m-l+1;
   n2=h-m;
    
   for(i=0; i<n1; i++) 
     arr1[i]=arr[l+i]; 
   for(j=0; j<n2; j++) 
     arr2[j]=arr[m+j+1]; 
 
 
   arr1[i]=9999;   
   arr2[j]=9999; 
 
 
   i=0; 
   j=0; 
   for(k=l; k<=h; k++) 
   { 
     if(arr1[i]<=arr2[j]) 
       arr[k]=arr1[i++]; 
     else 
       arr[k]=arr2[j++]; 
   } 
 
 } 

			


void ms(int arr[],int l,int h)
{	
	int i,m;	
	if(l<h)
	{
		m=(l+h)/2;
		ms(arr,l,m);
		ms(arr,m+1,h);
		merg(arr,l,m,h);
	}
	
}

void main()
{
	int n,i,a[100];
	printf("Enter size:\n");
	scanf("%d",&n);
	printf("\n Enter elements: ");
	for(i=0;i<n;i++)
	{
		scanf("\t %d",&a[i]);
	}
	printf("\n After Merge sort:");
	int low=0;
	int high=n-1;
	ms(a,low,high);
	 printf("Sorted array:");   
     for(i=0; i<n; i++) 
     printf("%d \t",a[i]);  
 

}
