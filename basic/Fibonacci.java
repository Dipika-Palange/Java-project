package basic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i,n;
		int first=0;
		int second = 1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(first+" ");
			int next=first+second;
			first=second ;
			second=next;
		}
	}

}
