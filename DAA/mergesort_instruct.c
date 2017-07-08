#include<stdio.h>
 
void ms(int a[],int i,int j);
void me(int a[],int lo,int mi,int mii,int hi);
int t[50];
 
int main()
{
    int a[30],n,i;
    printf("Enter no of elements:");
    scanf("%d",&n);
    printf("Enter array elements:");
    
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
        
    ms(a,0,n-1);
    
    printf("\nSorted array is :");
    for(i=0;i<n;i++)
        printf("%d ",a[i]);
}
 
void ms(int a[],int i,int j)
{
    int mid;
        
    if(i<j)
    {
        mid=(i+j)/2;
        ms(a,i,mid);       
        ms(a,mid+1,j);    
        me(a,i,mid,mid+1,j);    
	}
}
 
void me(int a[],int lo,int mi,int mii,int hi)
{
        
    int i,j,k;
    i=lo;    
    j=mii;    
    k=0;
    
    while(i<=mi && j<=hi)    
    {
        if(a[i]<a[j])
            t[k++]=a[i++];
        else
            t[k++]=a[j++];
    }
    
    while(i<=mi)    
        t[k++]=a[i++];
        
    while(j<=hi)    
        t[k++]=a[j++];
    for(i=lo,j=0;i<=hi;i++,j++)
        a[i]=t[j];
    
}


