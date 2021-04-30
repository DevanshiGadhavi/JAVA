/* Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-1
Practical-5 */

import java.util.*;
interface shape2d
{
	public double area();
}	
class Rectangle implements shape2d
{
	double length,width;

	public Rectangle(double l,double w)
	{
		length=l;
		width=w;
	}
	public double area()
	{
		return length*width;
	}
}
class Triangle implements shape2d
{
	double base,height;
	
	public Triangle(double b,double h)
	{
		base=b;
		height=h;
	}
	public double area()
	{
		return base*height;
	}
}
class Circle implements shape2d
{
	double radius;
	public Circle(double r)
	{
		radius=r;
	}
	public double area()
	{
		return 3.14*radius*radius;
	}
}

class interfaceDemo
{
	public static void main(String s[])
	{
		double l,w,b,h,r;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Length:-");
		l=sc.nextDouble();
		System.out.print("Enter Width:-");
		w=sc.nextDouble();
		Rectangle r1=new Rectangle(l,w);
		System.out.println("Area Of Rectangle Is:-\n"+r1.area());

		System.out.print("Enter Base:-");
		b=sc.nextDouble();
		System.out.print("Enter Height:-");
		h=sc.nextDouble();
		Triangle t1=new Triangle(b,h);
		System.out.println("Area Of Triangle Is:-\n"+t1.area());

		System.out.print("Enter Radius:-");
		r=sc.nextDouble();
		Circle c1=new Circle(r);
		System.out.println("Area Of Circle Is:-"+c1.area()); 
	}
}