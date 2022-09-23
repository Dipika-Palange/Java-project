package basic;

import java.util.Scanner;

public class DoArea {

	public static void main(String[] args) {
		
		int r,l,b,h,ba;
		double pi=3.14;
		
		String  choice;
		char ch;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice:\n Circle \n Rectangle \n Triangle");
		choice =sc.nextLine();
		switch(choice)
		{
		case "Circle" :
			System.out.println("enter the radius");
			r=sc.nextInt();
			System.out.println("area of circle="+(3.14*r*r));
			break;
			
		case "Rectangle":
			System.out.println("enter the value of Length and Breadth");
			l=sc.nextInt();
			b=sc.nextInt();
			System.out.println("area of rectangle="+(l*b));
			break;
			
			
		case "Triangle":
			System.out.println("enter the value of height and base");
			h=sc.nextInt();
			ba=sc.nextInt();
			System.out.println("area of traingle="+(0.5*h*ba));
			break;
			default:
				System.out.println("Invalid choice");
		}
		System.out.println("do you want to continue(y/n):");
		ch=sc.next().charAt(0);
		
		}
		while(ch=='y'||ch=='Y');
	}

}
