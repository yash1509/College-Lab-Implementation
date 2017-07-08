#include <stdio.h>
#include <string.h>
void main()
{
     char s[50],ch;
     int i,c=0;
     clrscr();
     printf("Enter any string : ");
     for(i=0;ch!='\n';i++){
     ch=getchar();
     s[i]=ch;
     }
     s[i]='\0';

     for(i=0;s[i]!='\0';i++){
    if(s[i]==' '){
       c++;
       while(s[i]==' ')
        i++;
    }
     }
     printf("\n\nTotal words are %d",c+1);
}
