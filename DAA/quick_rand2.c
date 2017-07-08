#include <stdio.h>
 #include <stdlib.h>

 
 int partition(int a[],int p,int r)
 {
 srand(NULL);
 int pivot = rand()%(r-p);
 pivot += p;
 int t=a[r];
 a[r]=a[pivot];
 a[pivot]=t;
 pivot = r;
 int temp = a[r];
 int i = p-1; int j;
 for (j = p; j < r ;j++) 
{
  if ( a[j] <  temp ) 
  {
   i++;
   t=a[j];
 	a[j]=a[i];
 	a[i]=t;
  }
}
 i++;
 t=a[r];
 a[r]=a[i];
 a[i]=t;
 return i;
 }
 
 
 void quicksort(int a[],int p,int r)
 {
 if (p < r)
 {
  int q = partition(a,p,r);
  quicksort(a,p,q);
  quicksort(a,q+1,r);
 }
 }

void main() 
 { int i;
 int a[] ={2123,5,6,12,1,19,98};
 quicksort (a,0,6);
 printf("\n");
 for (i=0;i<7;i++)
  printf("%d \t",a[i]);
 }

