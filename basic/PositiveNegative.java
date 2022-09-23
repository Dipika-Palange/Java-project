package basic;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println(n+ "number is positive");
		}
		else if(n<0)
		{
			System.out.println(n+ "number is negative");
		}
		else
		{
			System.out.println(n+ "number is zero");
		}

	}

}
