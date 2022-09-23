package basic;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,r;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		while(n>0)
		{
		     r=n%10;
			sum=sum+r;
			n=n/10;
			
		}
		System.out.println("sum of digit=" +sum);

	}

}
