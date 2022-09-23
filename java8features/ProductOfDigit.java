package java8features;

import java.util.Scanner;

public class ProductOfDigit {

	
	public int divisibleByThreeFive(int n)
	{
		int prod=1;
		int r;
		while(n>0)
		{
		     r=n%10;
			prod=prod*r;
			n=n/10;
			
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
	}

}
