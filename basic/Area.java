package basic;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,l,b,h,ba;
	 double   pi=3.14,AC;
		System.out.println("enter value of r");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
	
		AC= 3.14 *r*r ;
		
		System.out.println("Area of Circle"+AC);
		
		System.out.println("enter value of  l and b");
		l=sc.nextInt();
		b=sc.nextInt();
		
		int AR= l*b ;
		
		System.out.println("area of rectangle"+AR);
		
		System.out.println("enter value of  h and ba");
		h=sc.nextInt();
		ba=sc.nextInt();
		
double  AT= 0.5*h*ba;
		
		System.out.println("area of rectangle"+AT);
		
	}

}
