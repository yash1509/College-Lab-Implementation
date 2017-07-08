#include <GL/glut.h>
#include <stdio.h>
#include <math.h>

void Pix(GLint x,GLint y)
{
  glBegin(GL_POINTS);
  glVertex2i(x,y);
  glEnd();
}

void bres()
{
  int x0 = 100, y0=100, x1 = 300, y1 = 300, x, y;
  int	dx, dy,pk,k;
  glClear(GL_COLOR_BUFFER_BIT);
  glColor3f( 0 ,0, 100);  
  Pix(x0, y0);	
  dx = x1 - x0;
  dy = y1 - y0;
  pk = 2 * dy - dx;
  x = x0;	y = y0; 
  for ( k = 0; k < dx-1; ++k ) 
  {
    if ( pk < 0 ) 
      pk = pk + 2 * dy;			
	 else 
	 { 				
      	pk = pk + 2*dy - 2*dx;	
      	++y;
     }
    ++x;
    Pix( x, y );
  }
  glFlush();
}

void init()
{
  glClearColor(1.0,1.0,1.0,0.0);
  gluOrtho2D(0.0,400.0,0.0,400.0);
}

int main(int argc,char **argv)
{
    glutInit(&argc,argv);
    glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB);
    glutInitWindowSize(1280,720);
    glutCreateWindow("Bresh Line Algo");
    init();
    glutDisplayFunc(bres);
    glutMainLoop();
    return 0;
}


