#include<stdio.h>
#include<stdlib.h>
void main()
{
	char ch,l,k; FILE *fp;
	fp=fopen("str.txt","r");
	l=fgetc(fp);
	while(l!=EOF)
    	{
    	  ch=l;
    	  l=fgetc(fp);
	     if((ch=='a')&&(l=='b')) 
	     {
	        ch=fgetc(fp);
	        l=fgetc(fp);
		if(ch == 10)
		{
			printf("String accepted");
			exit(0);
		} 	
	   while(!((ch=='a')&&(l=='b'))) 
	        {
		  ch=l;
	          l=fgetc(fp);
	          if(ch==10 || l==10)
		  {
			printf("String doesnt start or end with ab \n"); exit(0);
		  }
	     	}
			if((ch=='a')&&(l=='b'))
			{
				k=fgetc(fp);
				if( k == 10)
				{	printf("String accepted"); exit(0); }
				else 
				{
					ch=l; l=k;
					 
				}
			}  	
			
	     } 
	      
	}
       			printf("The string doesn't start or end with ab \n");
			exit(0);
	fclose(fp);			
	
}

