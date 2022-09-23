package basic;

import java.util.Scanner;

public class DoArithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		char choice,ch;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter the choice \n + for addition \n - for substraction \n * for multiplication \n / for division ");
		choice=sc.next().charAt(0);
		
		switch(choice)
		{
		case '+' :
		System.out.println("Add"+(a+b));
		break;
		case '-' :
			System.out.println("sub"+(a-b));
			break;
		case '*' :
			System.out.println("mult"+(a*b));
			break;
		case '/' :
			System.out.println("div"+(a/b));
			break;
		default:
			System.out.println("invalid choice");
		}
		System.out.println("do you want to continue(y/n):");
		ch=sc.next().charAt(0);
		
		}
		while(ch=='y'||ch=='Y');
	}

}
