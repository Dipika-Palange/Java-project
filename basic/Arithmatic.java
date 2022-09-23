package basic;

import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		c=a+b;
		int s= a-b;
		int m=a*b;
		int d=a/b;
		
		System.out.println("Addition= " +c);
		System.out.println("Substraction = " +s);
		System.out.println("Multiplication = " +m);
		System.out.println("Division= " +d);
	}

}
