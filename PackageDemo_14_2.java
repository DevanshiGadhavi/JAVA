/*Name:-Gadhavi Devi VinodBhai
Roll Number:-12008117
MCA Semester-1
Practical-14.2 */




class Sphere {
	double area;
	private double radius;
	Sphere(){
	
		radius = 0.0;
		
	
	}
	
	Sphere(double r){
	
		this.radius = r;
		
	
	}
	
	public double area(){
		
		
		area = ((4 * Math.PI *radius*radius*radius)/3) ;
		
		return area;
	}
	


}

class Cube{
	
	double a;
	double area;
	Cube(){
		
		a=0;
	}
	Cube(double a){
		
		this.a=a;
	}
	
	public double area(){
		
		
		area = a*a*a;
		return  area;
	} 



}

class PackageDemo_14_2 {

	public static void main(String args[]){
		
		Sphere sp = new Sphere(9.5);
		Cube cb = new Cube(45);
		
		System.out.println("Area of Sphere : " + sp.area());
		System.out.println("Area of Sphere : " + cb.area());
	
	}

}