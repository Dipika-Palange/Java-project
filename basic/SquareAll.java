package basic;

import java.util.Scanner;

public class SquareAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(""+i*i);
		}
		
	}

}
