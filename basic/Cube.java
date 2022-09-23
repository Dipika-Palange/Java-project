package basic;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println(""+i*i*i);
		}
	}
}