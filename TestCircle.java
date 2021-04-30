/*Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-2
Practical-2 */


import java.util.*;
class Circle
{
	double area,r;
	public Circle()
	{
		r=1.0;
	}
	public Circle(double r)
	{
		this.r=r;
	}
	public double getRadius()
	{
		return r;
	}
	public double area()
	{
		return area= r*r*Math.PI;
	}		
}
class TestCircle 
{
   public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
	  //System.out.print("Enter the radius:");
      //double rad= s.nextDouble();
	  Circle c1=new Circle();
      System.out.println("Area of Circle with radius " + c1.getRadius() + " is: " + c1.area()); 
	  Circle c2=new Circle(4.0);
      System.out.println("Area of Circle with radius " + c2.getRadius() + " is: " + c2.area()
	  ); 	  
   }
 }