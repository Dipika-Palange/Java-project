package multithreading;

import java.util.Scanner;

public class SeconSmallDiv {
	
	public int SeconSmallest(int no)
	{
		int j,div=0;
			if(no%2==0)
			{
				div=2;
			}
			else if(no%3==0)
			{
				div=3;
			}
			else if(no<0||no>32767)
			{
				div=-1;
			}
			else
			{
			
				div=no;
			}
			return div;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		SeconSmallDiv sd=new SeconSmallDiv();
		int divisor =sd.SeconSmallest(no);
			if(divisor==-1)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
			System.out.println("Second Smallest Divisor is :" +divisor);
	}

}
