/*Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-1
Practical-4 */


import java.util.*;
abstract class Shape
{
	int l,b,r;
	Scanner s=new Scanner(System.in);
	abstract void area();
	abstract void perimeter();
}
class Rectangle extends Shape
{
	void area()
	{
		System.out.println("***Find the area and primeter of rectangle***");
		System.out.print("Enter length::");
		l=s.nextInt();
		System.out.print("Enter breath::");
		b=s.nextInt();
		System.out.println("Area of rectangle is " + l*b);
	}
	void perimeter()
	{
		System.out.println("Perimeter of rectangle is " + 2*(l+b ));
	}
}
class Triangle extends Shape
{
	void area()
	{
		System.out.println("***Find the area and perimeter of Triangle***");
		System.out.print("Enter base::");
		l=s.nextInt();
		System.out.print("Enter height::");
		b=s.nextInt();
		System.out.println("Area of rectangle is " + (l*b)/2);
	}
	void perimeter()
	{
		System.out.println("Perimeter of triangle is " + l*b);
	}
}
class Circle extends Shape
{
	void area()
	{
		System.out.println("***Find the area and perimeter of Circle***");
		System.out.print("Enter radius::");
		r=s.nextInt();
		System.out.println("Area of circle is " + Math.PI*r*r);
	}
	void perimeter()
	{
		System.out.println("Perimeter of circle is " + Math.PI*2*r);
	}
}
public class AbstractClass
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.area();
		r.perimeter();
		Triangle t=new Triangle();
		t.area();
		t.perimeter();
		Circle c=new Circle();
		c.area();
		c.perimeter();
	}
}