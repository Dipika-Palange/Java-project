package basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("ente the number");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			sum=sum*i;
			
		}
		System.out.println("Factorial of number ="+sum);
	}

}
