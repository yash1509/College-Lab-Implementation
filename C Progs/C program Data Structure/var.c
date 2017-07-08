#include <stdio.h>
#include <math.h>
int main()
{
		float a[20],sum,am,var,sd;
		int i,n;
		printf("\n Enter set of values of data items");
		scanf("%d",&n);
		printf("Enter the data of %d numbers",n);
		for (i=0;i<n;i++)
			scanf("%f",&a[i]);
		sum=0;
		for(i=0;i<n;i++)
			sum=sum+a[i];
		am=sum/n; sum=0;
		for (i=0;i<n;i++)
			sum=sum+((a[i]-am)*(a[i]-am));
			var=sum/n; sd=sqrt(var);
		printf("\n Mean = %f",am);
		printf("\n Variance = %f",var);
		printf("\n Standard Deviatation = %f",sd);
}
