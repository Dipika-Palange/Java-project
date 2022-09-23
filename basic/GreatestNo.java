package basic;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+ "is greatest ");
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println(n2+ "is greatest ");
		}
		else
		{
			System.out.println(n3+ "is greatest ");
		}
			
	}

}
