package basic;

import java.util.Scanner;

public class WhileReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,r;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		number=sc.nextInt();
		while(number>0)
		{
			r=number%10;
			sum=(sum*10)+r;
			number=number/10;
		}
		System.out.println("Reverse number= " +sum);

	}

}
