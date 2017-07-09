#include <GL/glut.h>
#include <time.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char s1[50]; char s2[50];
char s3[8] = {' ', ' ', 'W', 'I', 'N','S','\0'};

class reflector_maniac
{
public:
	int OrthoWid; int OrthoHei;
	int WinWid; int WinHei;
	int winXPos; int winYPos;
	float FieldSizeX; float FieldSizeY;
	int delay; 
	float PThickness; float BallSize;
	float BorderT; float MLineT;
	int ScoreL; int ScoreR;
	float TextPosX; float TextPosY;
	float BallSpeedX; float PSpeedY;
	reflector_maniac(){
		WinWid = 700; WinHei = 700;
		OrthoWid = 700; OrthoHei = 700;	
		winXPos = 100; winYPos = 100;
		delay = 1;
		PThickness = 12; BallSize = 12;
		FieldSizeX = 600; FieldSizeY = 400;
		BorderT = 2; MLineT = 2;
		ScoreL = 0; ScoreR = 0;
		TextPosX = 0; TextPosY = FieldSizeY + 10;
		BallSpeedX = 1; PSpeedY = 1.4;
	}
	void start_settings();
	void win();
	void KeyControl();
	void KeyReset();
	void DrawField();
	void DrawScore();
}settings;

class ball
{
public:
float x; float y;
float vx; float vy;
void move();
void reflection();
void draw();
}ball;

class paddle
{
public: 
	float x,y; float vy;
	float size;
	bool Up, Down, hold;
	paddle(){
	vy = 0;
	Up = false; Down = false; hold = false;
	}
	void draw(); 
	void move();
	void care();
}left,right;

void reflector_maniac::KeyReset()
{
	left.vy = 0; right.vy = 0;
}

void reflector_maniac::KeyControl()
{
	if(left.Up)left.vy = PSpeedY; 
	if(left.Down)left.vy = -PSpeedY; 
	if(right.Up)right.vy = PSpeedY; 
	if(right.Down)right.vy = -PSpeedY;
}

void reflector_maniac::start_settings()
{
left.size = 200; right.size = 200;
left.x = -510; right.x = 510;
ball.vy = 0;
ball.x = 0; ball.y = 0;
while(ball.vx == 0)ball.vx = (rand()%3 - 1)*BallSpeedX;
}

void reflector_maniac::win()
{
	if((ScoreL == 5)||(ScoreR == 5)){
		glutTimerFunc(2000,exit,0);
		settings.delay = 10000;
	}
	if(ball.x < left.x + PThickness - BallSpeedX) 
	{
		right.hold = true;	
		ScoreR++;
	}
	if(ball.x > right.x - PThickness + BallSpeedX) 
	{
		left.hold = true;		
		ScoreL++;
	}
}

void paddle::care()
{
	if(hold){
		ball.vx = 0;
		if(x < 0)ball.x = x + 2*settings.PThickness; 
		if(x > 0)ball.x = x - 2*settings.PThickness; 
		ball.vy = vy; ball.y = y;
	}
}

void reflector_maniac::DrawField()
{
	glColor3f(.2,0,1);
	glVertex2f(-FieldSizeX - BorderT,-FieldSizeY - BorderT);
	glVertex2f(FieldSizeX + BorderT,-FieldSizeY - BorderT);
	glVertex2f(FieldSizeX + BorderT,-FieldSizeY);
	glVertex2f(-FieldSizeX - BorderT,-FieldSizeY);

	glVertex2f(-FieldSizeX - BorderT,FieldSizeY + BorderT);
	glVertex2f(FieldSizeX + BorderT,FieldSizeY + BorderT);
	glVertex2f(FieldSizeX + BorderT,FieldSizeY);
	glVertex2f(-FieldSizeX - BorderT,FieldSizeY);

	glVertex2f(-FieldSizeX - BorderT,-FieldSizeY - BorderT);
	glVertex2f(-FieldSizeX,-FieldSizeY - BorderT);
	glVertex2f(-FieldSizeX,FieldSizeY + BorderT);
	glVertex2f(-FieldSizeX - BorderT, FieldSizeY + BorderT);

	glVertex2f(FieldSizeX,-FieldSizeY - BorderT);
	glVertex2f(FieldSizeX + BorderT,-FieldSizeY - BorderT);
	glVertex2f(FieldSizeX + BorderT,FieldSizeY + BorderT);
	glVertex2f(FieldSizeX, FieldSizeY + BorderT);


	
	glVertex2f(-MLineT,-FieldSizeY + MLineT);
	glVertex2f(MLineT,-FieldSizeY + MLineT);
	glVertex2f(MLineT,FieldSizeY - MLineT);
	glVertex2f(-MLineT,FieldSizeY - MLineT);
	
}

void printX(int x, int y,int z, char *string)
{

glRasterPos2f(x,y);
int len = (int) strlen(string);

for (int i = 0; i < len; i++) 
{
glutBitmapCharacter(GLUT_BITMAP_9_BY_15,string[i]);
}
for(int j=0;j<7;j++)
{
glutBitmapCharacter(GLUT_BITMAP_9_BY_15,s3[j]);
}
};

void reflector_maniac::DrawScore()
{
	
	glColor3f(1,0,0);
	glRasterPos2f(TextPosX - 350, TextPosY -920);
	glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_24 , '0' + ScoreL);
	glRasterPos2f(TextPosX + 350, TextPosY -920);
	glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_24 , '0' + ScoreR);
	if(ScoreL == 5)
	{
		glColor3f(.1,.9,.3);
	    printX(TextPosX - 350, TextPosY - 420,0, s1);
	}
	if(ScoreR == 5)
	{
		glColor3f(.1,.9,.3);
		printX(TextPosX + 150, TextPosY - 420,0, s2);
	}
}

void paddle::move()
{
	y += vy;
	if(y < -settings.FieldSizeY + size/2) 
	{
		y = -settings.FieldSizeY + size/2;
		vy = 0;
	}
	if(y > settings.FieldSizeY - size/2) 
	{
		y = settings.FieldSizeY - size/2;
		vy = 0;
	}
}

void paddle::draw()
{
glColor3f(.8,.2,0);
glVertex2f(x + settings.PThickness,y + size/3);
glVertex2f(x + settings.PThickness,y - size/2);
glVertex2f(x - settings.PThickness,y - size/3);
glVertex2f(x - settings.PThickness,y + size/2);
}

void ball::reflection()
{
if((y <= -settings.FieldSizeY)||(y >= settings.FieldSizeY))vy = -vy; 
if((x <= left.x+2*settings.PThickness)&&(fabs(double(y - left.y)) <= left.size/2 ))
{
	vx = -vx; 
	vy += left.vy;
}
if((x >= right.x-2*settings.PThickness)&&(fabs(double(y - right.y)) <= right.size/2 ))
{
	vx = -vx; 
	vy += right.vy;
}
}

void ball::draw()
{
glColor3f(1,1,1);
glVertex2f(x+settings.BallSize,y+settings.BallSize);
glVertex2f(x+settings.BallSize,y-settings.BallSize);
glVertex2f(x-settings.BallSize,y-settings.BallSize);
glVertex2f(x-settings.BallSize,y+settings.BallSize);
}

void ball::move()
{
	x += vx;
	y += vy;
}

void keyboard(unsigned char key, int x,int y)
{
	switch(key){
	case 'a' :
		left.Up = true;
		break;
	case 's' :
		left.Down = true;
		break;
	case 'd' :
		if(left.hold){
			left.hold = false;
			ball.vx = settings.BallSpeedX;
		}
		break;
	case 'j' :
		right.Up = true;
		break;
	case 'k' :
		right.Down = true;
		break;
	case 'l' :
		if(right.hold){
			right.hold = false;
			ball.vx = -settings.BallSpeedX;
		break;
		}
	}	
}

void keyboardUp(unsigned char key, int x,int y)
{
	switch(key){
	case 'a' :
		left.Up = false;
		break;
	case 's' :
		left.Down = false;
		break;
	case 'j' :
		right.Up = false;
		break;
	case 'k' :
		right.Down = false;
		break;
	}	
}

void Timer (int value)
{
	settings.win();
	settings.KeyControl();
	left.move();
	right.move();
	ball.move();
	ball.reflection();
	left.care();
	right.care();
	settings.KeyReset();
	glutPostRedisplay();
	glutTimerFunc(settings.delay,Timer,0);
}

void draw()
{
	glClear(GL_COLOR_BUFFER_BIT);
	glBegin(GL_QUADS); 
	right.draw(); 
	left.draw(); 
	ball.draw(); 
	settings.DrawField(); 
	glEnd();
	settings.DrawScore(); 
	glutSwapBuffers();  
}

int main (int argc, char ** argv)
{
	
	printf("Enter Player 1 Name:");
	gets(s1);
	printf("Enter Player 2 Name:");
	gets(s2);
	printf("\n");
	srand(time(NULL));
	settings.start_settings();
	glutInit(&argc, argv); 
	glutInitDisplayMode(GLUT_RGB|GLUT_DOUBLE);
	glutInitWindowSize(settings.WinWid, settings.WinHei);
	glutInitWindowPosition(settings.winXPos, settings.winYPos);
	glutCreateWindow("Reflector Maniac");
	glutDisplayFunc(draw);
	glutTimerFunc(settings.delay,Timer,0);
	glutKeyboardFunc(keyboard);
	glutKeyboardUpFunc(keyboardUp);
	glClearColor(0,0,0,1.0);
	gluOrtho2D(-settings.OrthoWid,settings.OrthoWid,-settings.OrthoHei,settings.OrthoHei);
	glutMainLoop();
	return(0);
}
