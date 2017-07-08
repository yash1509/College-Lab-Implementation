import java.io.*;
class access
{
public int x;
static int y;
void cal(int a,int b)
{
x+=a;
y+=b;
}}
class stati_specifier
{

public static void main(String args[])
{int p=10,q=20;
boolean e;
access obj1=new access();
access obj2=new access();
obj1.x=0;
obj1.y=0;
obj1.cal(2,3);
System.out.println(obj1.x+""+obj2.y);
String s=p+q+"hello"+p+q;
System.out.println(s);
e=16>>1>>2%2==8;
System.out.println(e);
}
}
