#include<stdio.h>
void qs(int ar[], int fin, int lin)
{
    int pin, t, in1, in2;
    if(fin < lin)
    {
        pin = fin;
        in1 = fin;
        in2 = lin;
        while(in1 < in2)
        {
            while(ar[in1] <= ar[pin] && in1 < lin)
            {
                in1++;
            }
            while(ar[in2]>ar[pin])
            {
                in2--;
      		 }		
            if(in1<in2)
            {
                t = ar[in1];
                ar[in1] = ar[in2];
                ar[in2] = t;
            }
        }
        t = ar[pin];
        ar[pin] = ar[in2];
        ar[in2] = t;
        qs(ar, fin, in2-1);
        qs(ar, in2+1, lin);
    }
}

void main()
{
    int ar[100],n,i;
    printf("Enter the number of element you want to Sort : ");
    scanf("%d",&n);
    printf("Enter Elements in the list : ");
    for(i = 0; i < n; i++)
    {
        scanf("%d",&ar[i]);
    }
    qs(ar,0,n-1);
    printf("Sorted elements: ");
    for(i=0;i<n;i++)
    printf(" %d",ar[i]);
}
