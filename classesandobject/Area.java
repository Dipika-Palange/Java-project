package classesandobject;

import java.util.Scanner;

public class Area {
	
	Scanner sc=new Scanner(System.in);
	
	public void circle()
	{
		int r;
		double pi=3.14;
		System.out.println("enter the value of r");
		r=sc.nextInt();
		double areaOfCircle= 3.14*(r*r);
		System.out.println("Area of circle:"+areaOfCircle);
		
	}
	public int square()
	{
		int a;
		System.out.println("enter value of a and b");
		a=sc.nextInt();
	
		int c= (a*a);
		return c;
	}
	public void rectangle()
	{
		int l,b;
		System.out.println("enter value of l and b");
		l=sc.nextInt();
		b=sc.nextInt();
		int areaOfRect=l*b;
		System.out.println("Area of rectangle:" +areaOfRect);
	}
	public double triangle()
	{
		int h,b;
		
		System.out.println("enter value of h and b");
		h=sc.nextInt();
		b=sc.nextInt();
		double c=(0.5)*h*b;
	    return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area=new Area();
		area.circle();
		
		int areaOfSquare= area.square();
		System.out.println("Area of square:"+areaOfSquare);
		
		area.rectangle();
		
		double areaOfTriangle= area.triangle();
		System.out.println("Area of triangle:"+areaOfTriangle);
		
	}

}
