import java.util.*;
abstract class shape
{
double a,b;
abstract void printarea();
}
class rectangle extends shape
{
void getdata(double x,double y)
{
a=x;
b=y;
}
void printarea()
{
System.out.println("Area of rectangle="+(a*b));
}
}
class triangle extends shape
{
void getdata(double x,double y)
{
a=x;
b=y;
}
void printarea()
{
System.out.println("Area of triangle="+(0.5*a*b));
}
}
class circle extends shape
{
void getdata(double x)
{
a=x;
}
void printarea()
{
System.out.println("Area of rectangle="+(3.14*a*a));
}
}
public class main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ch;
shape si;
rectangle r=new rectangle();
triangle t=new triangle();
circle c=new circle();
System.out.println("\n1.Rectangle\n2.Triangle\n3.Circle\nEnter your choice:");
ch=sc.nextInt();
switch(ch)
{
case 1:System.out.println("Enter l and b:");
double l=sc.nextDouble();
double b=sc.nextDouble();
r.getdata(l,b);
r.printarea();
break;
case 2:System.out.println("Enter b and h:");
double w=sc.nextDouble();
double h=sc.nextDouble();
t.getdata(w,h);
t.printarea();
break;
case 3:
System.out.println("Enter r:");
double r1=sc.nextDouble();
c.getdata(r1);
c.printarea();
break;
default:System.out.println("Invalid choice");
}
}
}
