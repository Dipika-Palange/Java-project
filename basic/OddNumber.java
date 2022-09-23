package basic;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		 for(i=0;i<=n;i++)
		 {
			if(i%2!=0)
			{
				System.out.println(" "+i);
			}
		 }
		
	}

}
