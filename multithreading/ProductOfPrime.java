package multithreading;

import java.util.Scanner;

public class ProductOfPrime {

	public int ProductPrimeDigits(int n)
	{
		int prod=1;
		int rem;
		int no=n;
		
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			if(rem==2||rem==3||rem==5||rem==7)
			{
				prod=prod*rem;
			}
			else if(n<0||n>32767)
			{
				return -1;
			}
		}
		return prod;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int nos=sc.nextInt();
		
		ProductOfPrime pp=new ProductOfPrime();
		int pro=pp.ProductPrimeDigits(nos);
		
		if(pro<0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println("Product of prime digit is: "+pro);
		}
	}

}
