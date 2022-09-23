package classesandobject;

import java.util.Scanner;

public class TriangleArea {
 
	int h,b;
	public TriangleArea()
	{
		h=10;
		b=5;
	}
	public TriangleArea(int heigth,int base)
	{
		h=heigth;
		b=base;
	}
	public void area()
	{
		System.out.println("Area of Triangle:"+(0.5*h*b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleArea ta=new TriangleArea();
		ta.area();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		int p=sc.nextInt();
		int q=sc.nextInt();
		TriangleArea ta1=new TriangleArea(p, q);
		ta1.area();

	}

}
