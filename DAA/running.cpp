#include <graphics.h>
#include <stdio.h>
#include <math.h>

int main()
{
	int i,gd,gm;
	detectgraph(&gd,&gm);
    initgraph(&gd,&gm,"");
    float x,y,x1,y1,x2,y2,dx,dy,ff;
    printf("Enter x1 : ");
    scanf("%f",&x1);
    printf("Enter y1 : ");
    scanf("%f",&y1);
    printf("Enter x2 : ");
    scanf("%f",&x2);
    printf("Enter y2 : ");
    scanf("%f",&y2);
    dx=abs(x2-x1);    dy=abs(y2-y1);
    if(dx>=dy)
    {
    ff=dx; }
    else
   {
    ff=dy; }
    dx=dx/ff;
    dy=dy/ff;
    x=x1;
    y=y1;
    i=1;
    while(i<=ff)
    {
          putpixel(x,y,1);
          x=x+dx;
          y=y+dy;
          i=i+1;
          delay(100);
    }
    getch();
    closegraph();
}
