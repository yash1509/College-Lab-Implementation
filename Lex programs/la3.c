#include<stdio.h>
#include<stdlib.h>
void main()
{
	char ch,l; FILE *fp;
	fp=fopen("sour.txt","r");
	l=fgetc(fp);
	while(l!= EOF)
    	{
    	  ch=l;
    	  l=fgetc(fp);
	  
	     if((ch=='a')&&(l=='b')) 
	     {
	        ch=fgetc(fp);
	        l=fgetc(fp);
		if((ch=='a')&&(l=='b'))
		{
			printf("Substring found");
			exit(0);
		}
		else
		{
			continue;
		}
	     }
	}
	printf("Substring is not found");
	fclose(fp);			
	
}

