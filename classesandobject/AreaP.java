package classesandobject;

import java.util.Scanner;

public class AreaP {
	
	public void circle(int r)
	{
		
		double pi=3.14;
		
		System.out.println("Area of circle:"+3.14*(r*r));
		
	}
	public int square(int a)
	{
		return a*a;
	}
	public void rectangle(int l,int b)
	{
		System.out.println("Area of rectangle:" +(l*b));
	}
	public double triangle(int h,int b)
	{
		
		return (0.5)*h*b;
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaP ap=new AreaP();
		Scanner sc=new Scanner(System.in);
		System.out.println("ener the number");
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		ap.circle(p);
		int s=ap.square(p);
		System.out.println("Area of square::"+s);
		
		ap.rectangle(p, q);
		
		double  s1=ap.triangle(p,q);
		System.out.println("Area of triangle:"+s1);
		
		
	}

}
