package basic;

import java.util.Scanner;

public class DoWhileAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		char ch;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the 2 number");
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a+b;
			System.out.println("Addition of numbers" +c);
			
			System.out.println("Do  you want to continue(y/n)");
			ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
	}

}
