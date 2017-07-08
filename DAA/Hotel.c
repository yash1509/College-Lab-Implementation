#include<stdio.h>
#include <stdbool.h>
#include <stdlib.h>
int i,j,k,k1; char r3;
struct room
{
	int price;
	bool status;
};
struct room wingA[3][50];
struct room wingB[3][50];

struct visi
{
	char fname[30];
	char lname[30];
	int win;
	int floor;
	int room;
	int noofdays;
};
struct visi vis[300];

void visit(int x1,int y1, int r11, int yu)
{
	int k1; int bo;
	for(k1=0;k1<300;k1++)
	{
		if(vis[k1].win==0)
		{
		
		printf("Enter the first name :\n");
		scanf("%s",&vis[k1].fname);
		printf("Enter the last name :\n");
		scanf("%s",&vis[k1].lname);
		vis[k1].room=x1;
		vis[k1].floor=y1;
		vis[k1].win=r11;
		printf("Enter the no of days for booking:");
		scanf("\n %d",&bo);
		vis[k1].noofdays=bo;
		printf("Bill generated : %d \n",bo*yu);
		break;
		}
	}
}

void details()
{
	for(i=0;i<300;i++)
	{
		if(vis[i].floor!=0)
		{
			printf("First Name : - %s \n",vis[i].fname);
			printf("Last Name : - %s \n",vis[i].lname);
			printf("No of days in hotel : - %d \n",vis[i].noofdays);
			printf("Floor : - %d \n",vis[i].floor);
			printf("Room : - %d \n",vis[i].room);
			if(vis[i].win==1)
			{
				printf("Wing : - A \n");
			}
			else
				printf("Wing : - B \n");
		}
	}
	
	
}

void setro()
{
	for(i=0;i<1;i++)
	{
		for(j=0;j<50;j++)
		{
			wingA[i][j].price=1300;
		}
	}
	for(i=1;i<2;i++)
	{
		for(j=0;j<50;j++)
		{
			wingA[i][j].price=1500;
		}
	}
	for(i=2;i<3;i++)
	{
		for(j=0;j<50;j++)
		{
			wingA[i][j].price=2000;
		}
	}
	for(i=0;i<1;i++)
	{
		for(j=0;j<50;j++)
		{
			wingB[i][j].price=2500;
		}
	}
	for(i=1;i<2;i++)
	{
		for(j=0;j<25;j++)
		{
			wingB[i][j].price=2200;
		}
	}
	for(i=1;i<2;i++)
	{
		for(j=25;j<50;j++)
		{
			wingB[i][j].price=3200;
		}
	}
	for(i=2;i<3;i++)
	{
		for(j=0;j<25;j++)
		{
			wingB[i][j].price=2700;
		}
	}
	for(i=2;i<3;i++)
	{
		for(j=25;j<50;j++)
		{
			wingB[i][j].price=3400;
		}
	}
}

void priceofroom()
{
	for(i=0;i<3;i++)
	{
		for(j=0;j<50;j++)
		{
			printf("Wing A %d floor, Room %d :- %d \n",i+1,j+1,wingA[i][j].price);
		}
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<50;j++)
		{
			printf("Wing B %d floor, Room %d :- %d \n",i+1,j+1,wingB[i][j].price);
		}
	}
}

void roomall(int x)
{
	
	bool r2=false;
	for(i=0;i<3;i++)
		for(j=0;j<50;j++)
		{
			if(r2==wingA[i][j].status)
				{
				
					if(x==wingA[i][j].price)
					{
						wingA[i][j].status=true;
						printf("\n Wing A, %d Floor, Room %d is alloted \n",i+1,j+1);
						r3='A';
						int lmn=1;
						i++; j++;
						visit(j,i,lmn,x);
						break;
					}
				}
		}
		for(i=0;i<3;i++)
		for(j=0;j<50;j++)
		{
			if(r2==wingB[i][j].status)
				{
				
					if(x==wingB[i][j].price)
					{
						wingB[i][j].status=true;
						printf(" \nWing B, %d Floor, Room %d is alloted \n",i+1,j+1);
						char rr[]="Wing B";
						i++; j++;
						r3='B';
						int lmn=2;
						visit(j,i,lmn,x);
						break;
					}
				}
		}
}


void pri()
{
	int cho;
	int base=1300; int arr[4];
	int res=base;
	printf("The base price of room is %d:\n",base);
	printf("Enter the facilties you would like:\n");
	printf("TV (Costs 200+) \n 1) Yes \n 2) No \n");
	scanf("%d",&cho);
	switch(cho)
	{
		case 1: ;
				arr[0]=1; 
				res=res+200; break;
		case 2: ;
			 	 arr[0]=0;
	}
	printf("Mini Refrigerator (Costs 700+) \n 1) Yes \n 2) No \n");
	scanf("%d",&cho);
	switch(cho)
	{
		case 1: ;
				arr[1]=1; 
				res=res+700; break;
		case 2: ;
			 	 arr[1]=0;
	}
	printf("AC (Costs 1200+) \n 1) Yes \n 2) No \n");
	scanf("%d",&cho);
	switch(cho)
	{
		case 1: ;
			arr[2]=1; res=res+1200; break;
		case 2: ;
			 	 arr[2]=0;
	}
	int choi;
	printf("Total price of the room for a day would be :- %d \n",res);
	printf("Do you want to comfirm? 1) Yes or 2) No \n");
	scanf("%d",&choi);
	switch(choi)
	{
		case 1: ;
				roomall(res); break;
		case 2: ;
			 	exit(0);
	}
}



//status=false => Empty room |||||||| status=true => Room is accomodated.
void vac()
{
	printf("Vacant rooms in Wing A:\n");
	bool r=false;
	for(i=0;i<3;i++)
		for(j=0;j<50;j++)
		{
			if(r==wingA[i][j].status)
			{
				
					printf("%d Floor Room no - %d \n",i+1,j+1);
			}
		}
	printf("Vacant rooms in Wing B:\n");
	bool r1=false;
	for(i=0;i<3;i++)
		for(j=0;j<50;j++)
		{
			if(r1==wingB[i][j].status)
			{
				
					printf("%d Floor Room no - %d \n",i+1,j+1);
			}
		}	
};



void main()
{	setro();
	int ch;
	while(true)
	{
	printf("\nMenu");
	printf("\n 1) Vacant Rooms");
	printf("\n 2) Room allotment");
	printf("\n 3) Visitor Details");
	printf("\n 4) Exit");
	printf("\n Enter your choice \n");
	scanf("%d",&ch);
			switch(ch)
			{
				case 1: printf("\n");
						vac(); 
						break;
				case 2: printf("\n");
						pri();	
						break;
				case 3: printf("\n");  details();	break;
				case 4: printf("\n"); exit(0);	break;	
			}
	}
	
	
	
}
