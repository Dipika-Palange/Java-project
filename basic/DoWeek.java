package basic;

import java.util.Scanner;

public class DoWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		char ch;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice number \n 1. \n 2.\n 3.\n 4.\n 5. \n 6.\n 7.");
		number=sc.nextInt();
		
		switch(number)
		{
		case 1:
			System.out.println("Day is Monday");
			break;
		case 2:
			System.out.println("Day is Tuesday");
			break;
		case 3:
			System.out.println("Day is Wednesday");
			break;
		case 4:
			System.out.println("Day is Thursday");
			break;
		case 5:
			System.out.println("Day is Friday");
			break;
		case 6:
			System.out.println("Day is saturday");
			break;
		case 7:
			System.out.println("Day is Sunday");
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
